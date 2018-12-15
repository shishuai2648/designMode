package com.ss.pattern.proxy.cjlib;

public class CglibTest {

    public static void main(String[] args) throws Exception {
        Object obj = new CglibMeiPo().getInstance(LiSi.class);
        LiSi liSi = (LiSi)obj;
        liSi.findLove();
        System.out.println(obj.getClass());
    }
}
