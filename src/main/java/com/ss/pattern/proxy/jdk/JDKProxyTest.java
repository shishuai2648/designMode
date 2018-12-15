package com.ss.pattern.proxy.jdk;

import com.ss.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.*;

public class JDKProxyTest {

    public static void main(String[] args) throws Exception {
        ZhangSan zhangSan = new ZhangSan();
        Person obj = (Person)new JDKMeiPo().getInstance(zhangSan);
        System.out.println(obj.getClass());

        obj.job();

        // 1、拿到被代理的对象，并获取到他的所有的接口，反射获取
        // 2、JDK Proxy 类重新生成一个新的类，同时新的类要实现被代理类的所有接口
        // 3、动态的生成一些Java代码，将新加的业务逻辑方法由一定的逻辑代码去调用(在代码中体现)
        // 4、编译新生成的Java代码，编译后变成.class文件
        // 5、再重新加载到JVM中运行
        // 以上这个过程叫做字节码重组

        // JDK中有个规范，只要是$符号开头的一般都是自动生成的
        // 动态生成就是运行时生成
        // 通过反编译工具可以查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});

        FileOutputStream fos = new FileOutputStream("D:\\gubaoLearn\\designmode\\src\\main\\resources\\$Proxy.class");
        fos.write(bytes);
        fos.close();
    }
}
