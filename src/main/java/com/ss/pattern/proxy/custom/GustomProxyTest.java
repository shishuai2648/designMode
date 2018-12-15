package com.ss.pattern.proxy.custom;

import com.ss.pattern.proxy.jdk.ZhangSan;
import com.ss.pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GustomProxyTest {

    public static void main(String[] args) throws Exception {
//        ZhangSan zhangSan = new ZhangSan();
//        Person person = (Person) new CustomMeiPo().getInstance(zhangSan);
//        person.findLove();
        ZhangSan san = new ZhangSan();

        Object o = Proxy.newProxyInstance(ZhangSan.class.getClassLoader(),ZhangSan.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                method.invoke(proxy, args);

                return null;
            }
        });

        Person o1 = (Person) o;
        o1.findLove();
    }
}