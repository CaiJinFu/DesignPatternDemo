package status;

/**
 * @name DesignPatternDemo
 * @class name：status
 * @class describe 电源操作接口
 * @anthor 猿小蔡
 * @time 2021/5/7 23:20
 * @change
 * @chang time
 */
public class TvController implements PowerController {

  private TvState mTvState;

  @java.lang.Override
  public void powerOn() {
    setTvState(new PowerOnState());
    System.out.println("开机啦");
  }

  public void setTvState(TvState tvState) {
    mTvState = tvState;
  }

  @java.lang.Override
  public void powerOff() {
    setTvState(new PowerOffState());
    System.out.println("关机啦");
  }

  public void nextChannel() {
    mTvState.nextChannel();
  }

  public void prevChannel() {
    mTvState.prevChannel();
  }

  public void turnUp() {
    mTvState.turnUp();
  }

  public void turnDown() {
    mTvState.turnDown();
  }
}
