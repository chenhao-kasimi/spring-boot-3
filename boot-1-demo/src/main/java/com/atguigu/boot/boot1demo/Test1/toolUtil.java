package com.atguigu.boot.boot1demo.Test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class toolUtil {
    public static idols createProxy(idol idol){
        idols idolProxy = (idols)Proxy.newProxyInstance(toolUtil.class.getClassLoader(), new Class[]{idols.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sing")){
                            System.out.println("给钱");
                            return method.invoke(idol,args);

                        }else{
                            System.out.println("我不知道");
                        }
                        return null;
                    }
                });
        return idolProxy;
    }
}
