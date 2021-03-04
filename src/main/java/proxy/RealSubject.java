package proxy;

/**
 * @name DesignPatternDemo
 * @class name：proxy
 * @class describe
 * @anthor jin
 * @time 2021/3/4 15:10
 * @change
 * @chang time
 */
public class RealSubject implements ISubject {
  @Override
  public void doSomething() {
    // do some things
    System.out.println("这是RealSubject");
  }
}
