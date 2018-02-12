package com.okayde.gof.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HomeProxy implements InvocationHandler {
    private Person target;

    public Object getInstance(Person target) {
        this.target = target;
        Class clazz = target.getClass();
        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Begin");
        method.invoke(target, args);
        System.out.println("End");
        return null;
    }
}
