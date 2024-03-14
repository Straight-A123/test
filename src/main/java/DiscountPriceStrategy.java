/**
 * 打折定价策略
 */
class DiscountPriceStrategy implements PriceStrategy {
    private Fruit apple;
    private Fruit strawberry;
    private Fruit mango;

    public DiscountPriceStrategy(Fruit apple, Fruit strawberry, Fruit mango) {
        this.apple = apple;
        this.strawberry = strawberry;
        this.mango = mango;
    }

    @Override
    public double calculate(int appleCount, int strawberryCount, int mangoCount) {
        double totalPrice = appleCount * apple.getPrice() +
                            mangoCount * mango.getPrice();
        double discountedStrawberryPrice = strawberry.getPrice() * strawberryCount * 0.8; // 草莓打折
        return totalPrice + discountedStrawberryPrice;
    }
}