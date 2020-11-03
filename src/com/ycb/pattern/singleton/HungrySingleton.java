package com.ycb.pattern.singleton;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/6/11 19:47
 */

/**
 * 推荐使用指数：****4星
 * 优点：线程安全；延迟加载；效率较高
 * */
public class HungrySingleton {
    private static HungrySingleton instance = null;

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        if (instance == null){
            synchronized (HungrySingleton.class){
                if(instance == null){
                    instance = new HungrySingleton();
                }
            }
        }
        return instance;
    }
}
