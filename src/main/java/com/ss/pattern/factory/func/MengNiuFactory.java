package com.ss.pattern.factory.func;

import com.ss.pattern.factory.MengNiu;
import com.ss.pattern.factory.Milk;

public class MengNiuFactory implements Factory {
    public Milk getMilk() {
        return new MengNiu();
    }
}
