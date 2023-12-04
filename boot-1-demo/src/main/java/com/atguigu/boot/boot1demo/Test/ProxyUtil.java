package com.atguigu.boot.boot1demo.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//4.创建一个Proxy工具类，用于生成一个代理对象，相当于中介公司
public class ProxyUtil {
    public static star createProxy(superStar superStar){
//        ClassLoader loader :制定一个类加载器
//        Class<?>[] interfaces ：制定需要代理哪些方法，即2创建的接口
//        InvocationHandler h) :指定生成的代理对象的需要额外做什么

        //此时当前的对象为代理对象，虽然强转为star接口但是并不是由star生成的对象，接口无法实例化
        star starProxy = (star)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), new Class[]{star.class}, new InvocationHandler() {

                    @Override//代理对象干的事情是重点
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //proxy,可以获得当前的代理对象，即ProxyUtil生成的starProxy
                        //method,获取代理对象调用的方法，即sing,dance
                        //args,获取代理对象调用方法时锁传入的参数
                        if(method.getName().equals("sing")){
                            System.out.println("唱歌五十万");
                            //由哪个对象，执行的参数
                            return method.invoke(superStar,args);
                        }else {
                            System.out.println("我不会");
                        }


                        return null;
                    }
                }
        );
        System.out.println(starProxy.getClass());
        return starProxy;
    }
}
