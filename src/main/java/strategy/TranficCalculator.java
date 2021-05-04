package strategy;

/**
 * @name DesignPatternDemo
 * @class name：strategy
 * @class describe 公交出行价格计算器
 * @anthor 猿小蔡
 * @time 2021/5/4 17:17
 * @change
 * @chang time
 */
public class TranficCalculator {
  private CalculateStrategy mCalculateStrategy;

  public void setStrategy(CalculateStrategy calculateStrategy) {
    mCalculateStrategy = calculateStrategy;
  }

  public int calculatePrice(int km) {
    return mCalculateStrategy.calculatePrice(km);
  }
}
