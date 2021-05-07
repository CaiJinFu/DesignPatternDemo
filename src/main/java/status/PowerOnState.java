package status;

/**
 * @name DesignPatternDemo
 * @class name：status
 * @class describe 开机状态，此时再触发开机功能不做任何事情
 * @anthor 猿小蔡
 * @time 2021/5/7 23:16
 * @change
 * @chang time
 */
public class PowerOnState implements TvState {

  @java.lang.Override
  public void nextChannel() {
    System.out.println("下一个频道");
  }

  @java.lang.Override
  public void prevChannel() {
    System.out.println("上一个频道");
  }

  @java.lang.Override
  public void turnUp() {
    System.out.println("调高音量");
  }

  @java.lang.Override
  public void turnDown() {
    System.out.println("调低音量");
  }
}
