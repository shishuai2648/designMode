package com.work.workflow;

import java.util.List;
import java.util.Map;

public class workFlower {

    public static void main(String[] args) throws Exception {
        workFlower workFlower = new workFlower();
        workFlower.work(1,null);

    }

    public void work(Integer i, Map<String,Object> params) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        DataList data = new DataList();

        List<String> list = data.getList();
        String s = list.get(i);

        Class clazz = Class.forName(s);
        Object o = clazz.newInstance();
        Work work = (Work)o;
        work.work(params);
    }

}
