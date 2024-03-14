/**
 * 满减定价策略
 */
class DiscountOverPriceStrategy implements PriceStrategy {
    private PriceStrategy priceStrategy;

    public DiscountOverPriceStrategy(DiscountPriceStrategy discountPriceStrategy) {
        this.priceStrategy = discountPriceStrategy;
    }

    @Override
    public double calculate(int appleCount, int strawberryCount, int mangoCount) {

        double totalPrice = priceStrategy.calculate(appleCount, strawberryCount, mangoCount);
        if (totalPrice >= 100) {
            totalPrice -= 10; // 满100减10
        }
        return totalPrice;
    }
}