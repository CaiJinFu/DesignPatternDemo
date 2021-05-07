package status;

/**
 * @name DesignPatternDemo
 * @class name：status
 * @class describe 关机状态，此时只有开机功能是有效的
 * @anthor 猿小蔡
 * @time 2021/5/7 23:16
 * @change
 * @chang time
 */
public class PowerOffState implements TvState{

  @java.lang.Override
  public void nextChannel() {

  }

  @java.lang.Override
  public void prevChannel() {

  }

  @java.lang.Override
  public void turnUp() {

  }

  @java.lang.Override
  public void turnDown() {

  }
}
