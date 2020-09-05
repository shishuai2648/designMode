package com.ss.pattern.observer.guava;


import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的阐述是：" + str);
    }

    @Subscribe
    public void subscribes(String str){
        System.out.println("执行subscribe2方法，传入的阐述是：" + str);
    }

}
