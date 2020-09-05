package com.ss.pattern.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventListenter {

    protected Map<Enum,Event> events = new HashMap<>();




    public void addListenter(Enum eventType, Object target, Method callback){
        // 注册事件
        // 用反射调用方法
        events.put(eventType,new Event(target,callback));
    }

    protected void trigger(Enum call){
        if( !this.events.containsKey(call) ){
            return;
        }
        Event e = this.events.get(call).setTrigger(call.toString());

        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
