package com.ss.pattern.proxy.custom;

import com.ss.pattern.proxy.staticed.Person;

import java.lang.reflect.Method;

public class CustomMeiPo implements SSInvocationHandler{

    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class<? extends Person> clazz = target.getClass();
        return SSProxy.newProxyInstance(new SSClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是58：我要给你找工作，现在已经拿到你的建立");

        System.out.println("开始投递");

        method.invoke(this.target,args);

        System.out.println("安排面试");

        return null;
    }
}
