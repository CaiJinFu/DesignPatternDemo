import prototype.Address;
import prototype.User;
import proxy.DynamicProxy;
import proxy.ISubject;
import proxy.ProxyFactory;
import proxy.ProxySubject;
import proxy.RealSubject;
import proxy.RealSubject2;
import strategy.BusStrategy;
import strategy.SubwayStrategy;
import strategy.TranficCalculator;

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
    // proxy();
    // prototypePattern();
    strategyPattern();
  }

  /**
   * 策略模式：定义了一系列的算法，并将每一个算法封装起来，而且使他们还可以互相替换。
   */
  private static void strategyPattern() {
    TranficCalculator tranficCalculator = new TranficCalculator();
    //设置计算策略
    tranficCalculator.setStrategy(new BusStrategy());
    //计算价格
    System.out.println("公交车乘16公里的价格：" + tranficCalculator.calculatePrice(16));

    tranficCalculator.setStrategy(new SubwayStrategy());
    System.out.println("地铁乘16公里的价格：" + tranficCalculator.calculatePrice(16));
  }

  /**
   * 原型模式：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
   */
  private static void prototypePattern() {
    User user = new User();
    user.setAge(10);
    user.setName("小明");
    Address address = new Address();
    address.setAddress("义龙路");
    address.setCity("海口");
    user.setAddress(address);
    System.out.println("原始数据---" + user.toString());
    User clone = user.clone();
    System.out.println("复制数据---" + clone.toString());
    clone.setAge(2);
    clone.setName("杨光");
    Address cloneAddress = address.clone();
    clone.setAddress(cloneAddress);
    cloneAddress.setAddress("龙岗区");
    cloneAddress.setCity("深圳");
    System.out.println("修改数据后的原始数据---" + user.toString());
    System.out.println("修改数据后的复制数据---" + clone.toString());
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
    ISubject proxyInstance = (ISubject) java.lang.reflect.Proxy
        .newProxyInstance(classLoader, realSubject.getClass().getInterfaces(), dynamicProxy);
    proxyInstance.doSomething();
    // 注意这里，后面会有讲解
    System.out.println("Proxy : " + proxyInstance.getClass().getName());

    System.out.println("===================RealSubject2========================= ");
    RealSubject2 realSubject2 = new RealSubject2();
    DynamicProxy dynamicProxy2 = new DynamicProxy(realSubject2);
    ClassLoader classLoader2 = realSubject2.getClass().getClassLoader();
    ISubject proxyInstance2 = (ISubject) java.lang.reflect.Proxy
        .newProxyInstance(classLoader2, realSubject2.getClass().getInterfaces(), dynamicProxy2);
    proxyInstance2.doSomething();
    System.out.println("Proxy : " + proxyInstance2.getClass().getName());
    ISubject proxyInstance1 = (ISubject) new ProxyFactory(realSubject2).getProxyInstance();
    proxyInstance1.doSomething();
    System.out.println("Proxy : " + proxyInstance1.getClass().getName());
  }
}
