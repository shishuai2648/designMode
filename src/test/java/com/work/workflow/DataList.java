package com.work.workflow;

import java.util.ArrayList;
import java.util.List;

public class DataList {

    private List<String> list = new ArrayList<String>();

    public DataList(){
        list.add("com.work.workflow.ChiFan");
        list.add("com.work.workflow.QianDao");
        list.add("com.work.workflow.QiChuang");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
