package cn.dutyujm.shejimoshi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yu
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("jdk代理开始");
                        Object returnVal = method.invoke(target,objects);
                        System.out.println("jdk代理提交");
                        return returnVal;
                    }
                });
    }
}
