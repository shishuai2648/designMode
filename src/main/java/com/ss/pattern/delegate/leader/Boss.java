package com.ss.pattern.delegate.leader;

public class Boss {

    public static void main(String[] args) {

        // 客户请求
        // 委派模式：就是静态代理和策略模式的一种特殊的组合，在Spring中广泛中应用。

        // 客户请求(Boss)、委派者(Leader)、被委派者(Target)
        // 委派者要持有被委派者的引用
        // 代理模式：注重的是过程，委派模式注重的是结果
        // 策略模式注重的是可扩展(外部扩展)，委派模式注重内部的灵活和复用

        new Leader().doing("加密");
    }
}
