package strategy;

/**
 * @name DesignPatternDemo
 * @class name：strategy
 * @class describe 计算接口
 * @anthor 猿小蔡
 * @time 2021/5/4 17:07
 * @change
 * @chang time
 */
public interface CalculateStrategy {
  /**
   * 按距离来计算价格
   * @param km 公里
   * @return 返回价格
   */
  int calculatePrice(int km);
}
