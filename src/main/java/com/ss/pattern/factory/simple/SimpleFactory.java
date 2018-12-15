package com.ss.pattern.factory.simple;

import com.ss.pattern.factory.MengNiu;
import com.ss.pattern.factory.Milk;
import com.ss.pattern.factory.Tlunsu;
import com.ss.pattern.factory.Yili;

public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Tlunsu();
        } else if( "伊利".equals(name)){
            return new Yili();
        } else if( "蒙牛".equals(name)){
            return new MengNiu();
        }
        return null;
    }
}
