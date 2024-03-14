
/**
 * @author XUKAI
 * 定义超市类
 */

public class Supermarket {
    
    private PriceStrategy priceStrategy;

    public Supermarket(PriceStrategy pricingStrategy) {
        this.priceStrategy = pricingStrategy;
    }

    public double calculateTotalPrice(int appleCount, int strawberryCount, int mangoCount) {
        return priceStrategy.calculate(appleCount, strawberryCount, mangoCount);
    }

}
