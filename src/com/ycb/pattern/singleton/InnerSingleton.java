package com.ycb.pattern.singleton; /**
 *
 * 内部类实现单例模式
 * @author Interesting
 * @version 1.0
 * @date 2020/6/11 19:24
 */

/**
 * 推荐使用指数：****4星
 * 思路：
 *  静态内部类方式在Singleton类被装载时并不会立即实例化，
 *  而是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类，从而完成Singleton的实例化。
 *  类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，
 *  在类进行初始化时，别的线程是无法进入的。
 *
 * */
public class InnerSingleton {
    private InnerSingleton(){};

    private static class SingletonHolder{
        private static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInnerSingleton(){
        return SingletonHolder.instance;
    }

}
