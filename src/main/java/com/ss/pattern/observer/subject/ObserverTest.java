package com.ss.pattern.observer.subject;

import com.ss.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class ObserverTest {

    public static void main(String[] args) {
        try {
            // 观察者
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});
            // 这里写Lily subject为目标对象
            Subject subject = new Subject();
            subject.addListenter(SubjectEventType.ON_ADD,observer,advice);
            subject.addListenter(SubjectEventType.ON_REMOVE,observer,advice);
            subject.add();
            subject.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
