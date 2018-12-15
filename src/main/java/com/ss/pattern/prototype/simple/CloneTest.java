package com.ss.pattern.prototype.simple;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype();

        p.setName("Tom");
        p.getList().add("1");


        System.out.println(p.getList().hashCode());
        System.out.println(((Prototype)p.clone()).getList().hashCode());




    }
}
