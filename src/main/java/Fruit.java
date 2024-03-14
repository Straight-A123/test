
/**
 * @author XUKAI
 * 定义水果类
 */

public class Fruit {

    /**
     * 水果名称
     */
    private String name;

    /**
     * 水果单价
     */
    private double price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
