package proxy;

/**
 * @name DesignPatternDemo
 * @class name：proxy
 * @class describe
 * @anthor jin
 * @time 2021/3/4 15:48
 * @change
 * @chang time
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 动态代理工厂 */
public class ProxyFactory {
  private Object mTarget;

  /** 维护一个目标对象 */
  public ProxyFactory(Object target) {
    this.mTarget = target;
  }

  /**
   * 获取动态代理对象
   *
   * @return
   */
  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        mTarget.getClass().getClassLoader(),
        mTarget.getClass().getInterfaces(),
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("--------start-------");
            Object returnValue = method.invoke(mTarget, args);
            System.out.println("---------end--------");
            return returnValue;
          }
        });
  }
}
