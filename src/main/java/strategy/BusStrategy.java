package strategy;

/**
 * @name DesignPatternDemo
 * @class name：strategy
 * @class describe 公交车价格计算策略
 * @anthor 猿小蔡
 * @time 2021/5/4 17:08
 * @change
 * @chang time
 */
public class BusStrategy implements CalculateStrategy {
  /**
   * 北京公交车，10公里之内1块钱，超过10公里之后每加一元钱可以乘5公里
   *
   * @param km 公里
   * @return 返回价格
   */
  @Override
  public int calculatePrice(int km) {
    //超过10公里的总距离
    int extraTotal = km - 10;
    //超过的距离是5公里的倍数
    int extraFactor = extraTotal / 5;
    //超过的距离对5公里取余
    int fraction = extraTotal % 5;
    //价格计算
    int price = 1 + extraFactor * 1;
    return fraction > 0 ? ++price : price;
  }
}
