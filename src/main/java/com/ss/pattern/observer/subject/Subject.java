package com.ss.pattern.observer.subject;


import com.ss.pattern.observer.core.EventListenter;

public class Subject extends EventListenter {
    // 通常的话，采用动态代理来实现监控，避免了代码的侵入
    public void add(){
        System.out.println("调用一个添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用一个删除的方法");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
