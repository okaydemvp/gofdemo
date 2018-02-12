package com.okayde.gof.proxy.demo2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BookFacadeCglib implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getInstance(Class<?> target) {
        enhancer.setSuperclass(target);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Begin");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("End");
        return result;
    }
}
