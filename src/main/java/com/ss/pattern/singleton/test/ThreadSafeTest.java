package com.ss.pattern.singleton.test;

import com.ss.pattern.singleton.lazy.LazyThree;
import com.ss.pattern.singleton.lazy.LazyTwo;
import com.ss.pattern.singleton.register.RegisterEnum;
import com.ss.pattern.singleton.register.RegisterMap;
import com.ss.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {

    public static void main(String[] args) {

/*        int count = 20000;

        final CountDownLatch latch = new CountDownLatch(count);

//        final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<Hungry>());

        Long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < count ; i ++){
//            new Thread(){
//                @Override
//                public void run() {
                    Object obj = LazyTwo.getInstance();
                    System.out.println(System.currentTimeMillis()+":"+obj);

//                }
//            }.start();
//            latch.countDown();
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("总耗时："+(endTime - startTime));
//        try{
//            latch.await();
//            Thread.sleep(1000L);
//        } catch (Exception e){
//            e.printStackTrace();
//        }*/

        /*try {

//            Class.forName("com.ss.pattern.singleton.lazy.LazyThree");
            Class<?> clazz = LazyThree.class;

            Constructor[] cs= clazz.getDeclaredConstructors();

            for(Constructor c : cs){
                // 用反射强制访问
                c.setAccessible(true);
                Object o = c.newInstance();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        RegisterEnum.INSTANCE.getInstance();*/

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Seriabl.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriabl.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable)ois.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
