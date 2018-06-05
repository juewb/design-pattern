package com.design.pattern.proxy.jdk;

import com.design.pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xujue on 2018/6/5
 */
public class JDKMeipo implements InvocationHandler{

    private Person target;

    public Object getInstance(Person target) {
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");

        Object result = method.invoke(this.target,args);

        System.out.println("如果合适的话，就准备办事");

        return  result;
    }
}
