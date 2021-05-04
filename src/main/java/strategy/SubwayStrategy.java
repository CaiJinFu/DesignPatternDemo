package strategy;

/**
 * @name DesignPatternDemo
 * @class name：strategy
 * @class describe 地铁价格计算策略
 * @anthor 猿小蔡
 * @time 2021/5/4 17:08
 * @change
 * @chang time
 */
public class SubwayStrategy implements CalculateStrategy {
  /**
   * 6公里（含）内3块钱；6~12公里（含）4元；12~22公里（含）5元；22~32公里（含）6元；
   *
   * @param km 公里
   * @return 返回价格
   */
  @Override
  public int calculatePrice(int km) {
    if (km <= 6) {
      return 3;
    } else if (km > 6 && km < 12) {
      return 4;
    } else if (km > 12 && km < 22) {
      return 5;
    } else if (km > 22 && km < 32) {
      return 6;
    }
    return 7;
  }
}
