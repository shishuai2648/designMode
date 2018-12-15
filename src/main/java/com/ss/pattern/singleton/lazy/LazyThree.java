package com.ss.pattern.singleton.lazy;

public class LazyThree {

    private static boolean initialized = false;

    // 默认使用Lazy的时候，会先初始化内部类，再去实例化父类
    // 如果未使用，内部类是不加载的
    private LazyThree(){
        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例被侵犯");
            }
        }
    }

    public static final LazyThree getInstance(){
        return LazyHolder.LAZY;
    }


    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
