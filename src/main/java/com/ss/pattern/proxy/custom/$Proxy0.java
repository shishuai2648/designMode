package com.ss.pattern.proxy.custom;

import com.ss.pattern.proxy.staticed.Person;

import java.lang.reflect.Method;

public class $Proxy0 implements com.ss.pattern.proxy.staticed.Person {
    SSInvocationHandler h;

    public $Proxy0(SSInvocationHandler h) {
        this.h = h;
    }

    public void findLove() {
        try {
            Method m = com.ss.pattern.proxy.staticed.Person.class.getMethod("findLove", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void job() {
        try {
            Method m = com.ss.pattern.proxy.staticed.Person.class.getMethod("job", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void buy() {
        try {
            Method m = com.ss.pattern.proxy.staticed.Person.class.getMethod("buy", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void zufangzi() {
        try {
            Method m = com.ss.pattern.proxy.staticed.Person.class.getMethod("zufangzi", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}