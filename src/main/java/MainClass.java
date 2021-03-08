import proxy.DynamicProxy;
import proxy.ISubject;
import proxy.ProxyFactory;
import proxy.ProxySubject;
import proxy.RealSubject;
import proxy.RealSubject2;

/**
 * @name DesignPatternDemo
 * @class name：PACKAGE_NAME
 * @class describe
 * @anthor jin
 * @time 2021/3/4 13:56
 * @change
 * @chang time
 */
class MainClass {

  public static void main(String[] args) {
    proxy();
  }

  /** 代理模式 */
  private static void proxy() {
    // 代理模式：为其他对象提供代理对象，以控制对这个对象的访问。
    // 静态代理模式
    ProxySubject proxy = new ProxySubject(new RealSubject());
    proxy.doSomething();
    // 动态代理
    System.out.println("===================RealSubject========================= ");
    RealSubject realSubject = new RealSubject();
    DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
    ClassLoader classLoader = realSubject.getClass().getClassLoader();
    ISubject proxyInstance =
        (ISubject)
            java.lang.reflect.Proxy.newProxyInstance(
                classLoader, realSubject.getClass().getInterfaces(), dynamicProxy);
    proxyInstance.doSomething();
    // 注意这里，后面会有讲解
    System.out.println("Proxy : " + proxyInstance.getClass().getName());

    System.out.println("===================RealSubject2========================= ");
    RealSubject2 realSubject2 = new RealSubject2();
    DynamicProxy dynamicProxy2 = new DynamicProxy(realSubject2);
    ClassLoader classLoader2 = realSubject2.getClass().getClassLoader();
    ISubject proxyInstance2 =
        (ISubject)
            java.lang.reflect.Proxy.newProxyInstance(
                classLoader2, realSubject2.getClass().getInterfaces(), dynamicProxy2);
    proxyInstance2.doSomething();
    System.out.println("Proxy : " + proxyInstance2.getClass().getName());
    ISubject proxyInstance1 = (ISubject) new ProxyFactory(realSubject2).getProxyInstance();
    proxyInstance1.doSomething();
    System.out.println("Proxy : " + proxyInstance1.getClass().getName());
  }
}
