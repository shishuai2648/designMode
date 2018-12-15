package com.ss.pattern.proxy.custom;

import java.lang.reflect.Method;

public interface SSInvocationHandler {

    Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
