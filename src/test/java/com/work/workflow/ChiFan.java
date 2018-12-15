package com.work.workflow;

import java.util.Map;

public class ChiFan implements Work {
    public Map<String, Object> work(Map<String, Object> params) {
        System.out.println("吃饭");
        return null;
    }
}
