package com.ss.pattern.factory.func;

import com.ss.pattern.factory.Milk;
import com.ss.pattern.factory.Yili;

public class YiLiFactory implements Factory {
    public Milk getMilk() {
        return new Yili();
    }
}
