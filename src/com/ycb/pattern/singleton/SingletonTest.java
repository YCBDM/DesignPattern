package com.ycb.pattern.singleton;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/6/11 16:12
 */
class SingletonTest {
    public static void main(String[] args) {
        //枚举类方式
        Singleton SingletonEnum1 = SingletonEnum.ss1.getInstance1();
        Singleton SingletonEnum2 = SingletonEnum.ss1.getInstance1();
        SingletonEnum.ss1.getInstance2();
        System.out.println(SingletonEnum1);
        System.out.println(SingletonEnum2);
        SingletonEnum.ss1.getInstance2();

        //内部类方式
        InnerSingleton InnerSingleton1 = InnerSingleton.getInnerSingleton();
        InnerSingleton InnerSingleton2 = InnerSingleton.getInnerSingleton();
        System.out.println(InnerSingleton1);
        System.out.println(InnerSingleton2);

        //懒汉加载方式
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);
    }


}