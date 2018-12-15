package com.ss.pattern.factory.simple;

/**
 *     小作坊式的工厂模型
 *    @author: shishuai
 *    @date:   2018/11/18 16:56
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        // 这个new的过程实际上是一个比较复杂的工程
        // 我们可以看成是一个产品的生产过程，包括原料采集，生产工艺等等
        // System.out.println(new Tlunsu().getName());


        // 小作坊式的生产模式
        // 用户本身不再关心生产的过程，而只需要关心结果即可
        // 我们去除了new的过程，找了一个工厂SimpleFactory，告诉了他我们需要的产品，由他们生产出产品
        // 我们只需要调用。就像提货一样，我们进行了货物的提出



        // 小作坊的生产模式
        // 用户本身不再关心生产的过程，而只需要关心这个结果

        // 假如：特仑苏、伊利、蒙牛
        // 成分配比均是不同
        SimpleFactory factory = new SimpleFactory();

        // 将用户的需求告诉工厂，工厂就会提供相对应的产品返回
        // 工厂将创建产品(对象)的过程隐藏了，对用户而言完全不清楚是如何产生的
        System.out.println(factory.getMilk("特仑苏"));
    }
}
