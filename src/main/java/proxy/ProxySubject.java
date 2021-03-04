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
public class ProxySubject implements ISubject {
  private ISubject subject = null;

  public ProxySubject(RealSubject subject) {
    this.subject = subject;
  }

  @Override
  public void doSomething() {
    System.out.println("这是Proxy");
    System.out.println("代理之前");
    subject.doSomething();
    System.out.println("代理之后");
  }
}
