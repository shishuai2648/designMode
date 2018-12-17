package com.ss.pattern.decorator.test;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public class DecoratorTest {

    public static void main(String[] args) {

        // 为了让某个实现类在不修改原始类的基础上
        // 进行动态地覆盖或者增加方法
        // 实现类要保持原有类的层级关系
        // 采用装饰模式
        // 装饰者模式实际上是一种非常特殊适配器模式

        // 虽然DataInputStream功能更强大
        // DataInputStream同样要实现InputStream
        InputStream in = null;
        FilterInputStream fis = new DataInputStream(in);
    }
}
