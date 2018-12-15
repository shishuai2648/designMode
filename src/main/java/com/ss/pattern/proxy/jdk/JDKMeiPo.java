package com.ss.pattern.proxy.jdk;

import com.ss.pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler {

    // 被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;

        Class<? extends Person> clazz = target.getClass();
        // 用来生成一个新的对象(由字节码重组实现)，下半节会深入底层讲解，字节码是如何重组的。
        // 不用JDK也不用Cglib实现代理
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是58：我要给你找工作，现在已经拿到你的建立");

        System.out.println("开始投递");

        method.invoke(this.target,args);

        System.out.println("安排面试");

        return null;
    }
}
