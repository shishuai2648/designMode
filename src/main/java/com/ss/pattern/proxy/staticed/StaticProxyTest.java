package com.ss.pattern.proxy.staticed;

public class StaticProxyTest {

    public static void main(String[] args) {

        Son son = new Son();
        // 现在的父亲只能帮儿子找对象
        // 只能帮表妹找对象，不能帮陌生人
        Father father = new Father(son);

        father.findLove();
    }
}
