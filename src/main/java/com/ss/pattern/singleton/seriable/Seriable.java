package com.ss.pattern.singleton.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {

    private Seriable(){}

    public final static Seriable INSTANCE = new Seriable();


    public static Seriable getInstance(){
        return INSTANCE;
    }

    // 序列化和反序列化的协议
    private Object readResolve(){
        return INSTANCE;
    }
}
