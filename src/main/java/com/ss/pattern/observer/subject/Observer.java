package com.ss.pattern.observer.subject;

import com.ss.pattern.observer.core.Event;

public class Observer {

    public void advice(Event event){
        System.out.println("=========触发时间，打印日志==========\n" + event);
        System.out.println(this);
    }
}
