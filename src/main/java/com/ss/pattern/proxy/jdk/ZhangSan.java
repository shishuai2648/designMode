package com.ss.pattern.proxy.jdk;

import com.ss.pattern.proxy.staticed.Person;

public class ZhangSan implements Person {

    public void findLove(){
        System.out.println("肤白貌美大长腿");
        System.out.println("有车有房");
    }

    public void zufangzi() {
        System.out.println("租房子");
    }

    public void buy() {
        System.out.println("买东西");
    }

    public void job() {
        System.out.println("月薪超过50K");
        System.out.println("找工作");
    }

}
