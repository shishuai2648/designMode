package com.ss.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{

    private String name;

    private List list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
