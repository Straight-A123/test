import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 创建水果对象
        Fruit apple = new Fruit("苹果", 8);
        Fruit strawberry = new Fruit("草莓", 13);
        Fruit mango = new Fruit("芒果", 20);

        // 创建超市对象，传入不同的定价策略
        Supermarket basePricingSupermarket = new Supermarket(new BasePriceStrategy(apple, strawberry, mango));
        Supermarket discountPriceSupermarket = new Supermarket(new DiscountPriceStrategy(apple, strawberry, mango));
        Supermarket discountOverPriceSupermarket = new Supermarket(new DiscountOverPriceStrategy(new DiscountPriceStrategy(apple, strawberry, mango)));


        /**
         * 有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
         * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
         * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.print("请输入购买的苹果斤数：");
        int appleCountA = scanner.nextInt();
        System.out.print("请输入购买的草莓斤数：");
        int strawberryCountA = scanner.nextInt();

        double totalPriceA = basePricingSupermarket.calculateTotalPrice(appleCountA, strawberryCountA,0);
        System.out.println("A顾客总价为：" + totalPriceA + "元");

        /**
         * 超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.print("请输入购买的苹果斤数：");
        int appleCountB = scanner.nextInt();
        System.out.print("请输入购买的草莓斤数：");
        int strawberryCountB = scanner.nextInt();
        System.out.print("请输入购买的芒果斤数：");
        int mangoCountB = scanner.nextInt();
        double totalPriceB = basePricingSupermarket.calculateTotalPrice(appleCountB, strawberryCountB, mangoCountB);
        System.out.println("B顾客总价为：" + totalPriceB + "元");


        /**
         * 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.print("请输入购买的苹果斤数：");
        int appleCountC = scanner.nextInt();
        System.out.print("请输入购买的草莓斤数：");
        int strawberryCountC = scanner.nextInt();
        System.out.print("请输入购买的芒果斤数：");
        int mangoCountC = scanner.nextInt();
        double totalPriceC = discountPriceSupermarket.calculateTotalPrice(appleCountC, strawberryCountC, mangoCountC);
        System.out.println("C顾客总价为：" + totalPriceC + "元");


        /**
         * 促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        System.out.print("请输入购买的苹果斤数：");
        int appleCountD = scanner.nextInt();
        System.out.print("请输入购买的草莓斤数：");
        int strawberryCountD = scanner.nextInt();
        System.out.print("请输入购买的芒果斤数：");
        int mangoCountD = scanner.nextInt();
        double totalPriceD = discountOverPriceSupermarket.calculateTotalPrice(appleCountD, strawberryCountD, mangoCountD);
        System.out.println("D顾客总价为：" + totalPriceD + "元");

        scanner.close();
    }
}
