package com.ss.pattern.factory.func;

import com.ss.pattern.factory.Milk;
import com.ss.pattern.factory.Tlunsu;

/**
 * 事情变得越来越专业
 */
public class TelunsuFactory implements Factory {

    public Milk getMilk() {
        return new Tlunsu();
    }
}
