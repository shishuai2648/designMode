package com.ss.pattern.factory.func;

public class FactoryTest {

    public static void main(String[] args) {

        // 货比三家
        // 不知道谁好谁坏
        // 配置，可能会配置错误
        Factory factory = new MengNiuFactory();
        System.out.println(factory.getMilk());
    }
}