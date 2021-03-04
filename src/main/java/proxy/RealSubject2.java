package proxy;

/**
 * @name DesignPatternDemo
 * @class name：proxy
 * @class describe
 * @anthor jin
 * @time 2021/3/4 15:22
 * @change
 * @chang time
 */
public class RealSubject2 implements ISubject {
  private static final String TAG = RealSubject2.class.getName();

  @Override
  public void doSomething() {
    System.out.println("这是RealSubject2");
  }
}
