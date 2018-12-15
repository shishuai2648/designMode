package com.ss.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;


public class RegisterMap {

    private RegisterMap(){}

    private static Map<String,Object> register = new HashMap<String, Object>();


    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name) == null){
            try {
                register.put(name,new RegisterMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}
