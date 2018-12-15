package com.ss.pattern.factory.abstr;

import com.ss.pattern.factory.MengNiu;
import com.ss.pattern.factory.Milk;
import com.ss.pattern.factory.Tlunsu;
import com.ss.pattern.factory.Yili;
import com.ss.pattern.factory.func.MengNiuFactory;
import com.ss.pattern.factory.func.TelunsuFactory;
import com.ss.pattern.factory.func.YiLiFactory;

public class MilkFactory extends AbstractFactory {

    public Milk getMengniu() {
        return new MengNiuFactory().getMilk();
    }

    public Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }

    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }
}
