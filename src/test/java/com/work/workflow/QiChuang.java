package com.work.workflow;

import java.util.Map;

public class QiChuang implements Work {
    public Map<String, Object> work(Map<String, Object> params) {
        System.out.println("起床");
        return null;
    }
}
