package proxy;

/**
 * @name DesignPatternDemo
 * @class name：proxy
 * @class describe
 * @anthor jin
 * @time 2021/3/4 15:24
 * @change
 * @chang time
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 该类经常称之为事务处理类 */
public class DynamicProxy implements InvocationHandler {
  private static final String TAG = "DynamicProxy";
  private Object target;

  public DynamicProxy(Object target) {
    this.target = target;
  }

  /**
   * @param proxy 代理类
   * @param method 被代理的方法
   * @param args 被代理方法的参数
   * @return 返回代理对象
   * @throws Throwable
   */
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("开始日志。。。");
    method.invoke(target);
    System.out.println("结束日志。。。");
    return null;
  }
}
