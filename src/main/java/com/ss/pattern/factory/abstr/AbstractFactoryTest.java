package com.ss.pattern.factory.abstr;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory factory = new MilkFactory();

        // 对用户而言更加简单
        // 用户只有选择的权利，保证了程序的健壮性
        System.out.println(factory.getMengniu());
    }
}
