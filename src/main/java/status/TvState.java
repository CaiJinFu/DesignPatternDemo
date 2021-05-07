package status;

/**
 * @name DesignPatternDemo
 * @class name：status
 * @class describe 电视状态接口，定义了电视操作的函数
 * @anthor 猿小蔡
 * @time 2021/5/7 23:15
 * @change
 * @chang time
 */
public interface TvState {
  void nextChannel();

  void prevChannel();

  void turnUp();

  void turnDown();
}
