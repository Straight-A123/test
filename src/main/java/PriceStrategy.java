/**
 * 定价策略接口
 */
interface PriceStrategy {
    double calculate(int appleCount, int strawberryCount, int mangoCount);
}