/**
 * 基本定价策略
 */
class BasePriceStrategy implements PriceStrategy {
    private Fruit apple;
    private Fruit strawberry;
    private Fruit mango;

    public BasePriceStrategy(Fruit apple, Fruit strawberry, Fruit mango) {
        this.apple = apple;
        this.strawberry = strawberry;
        this.mango = mango;
    }

    @Override
    public double calculate(int appleCount, int strawberryCount, int mangoCount) {
        return appleCount * apple.getPrice() +
               strawberryCount * strawberry.getPrice() +
               mangoCount * mango.getPrice();
    }
}