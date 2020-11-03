package com.ycb.pattern.singleton;


/**
 * @author Interesting
 * @version 1.0
 * @date 2020/6/11 16:02
 */

public enum SingletonEnum {
    ss1,
    ss2,
    ;

    /***
     * 推荐使用指数：*****5星
     * 思路：
     * 第一步：先定义一个类Singleton；
     * 第二步：定义一个枚举类SingletonEnum，只有一个枚举值SS1;
     *      1.在枚举类里面定义一个Singleton类型的变量，来接收构造函数SingletonEnum()返回的值；
     *      2.而构造函数是返回一个Singleton对象；
     *      3.再定义一个方法“getObject()”返回之前构造函数SingletonEnum()生成的对象Singleton
     * 原理思考：SingletonPattern.SingletonEnum 因为只枚举了1个值 SS1，那么在列举枚举值的时候：
     *      SingletonPattern.SingletonEnum.SS1 实际上会调用枚举类的构造函数，而构造函数就是生成一个Singleton对象，再调用对象的getObject方法，返回一个对象；
     *      如果随后调用
     *          SingletonPattern.SingletonEnum.SS2；
     *          则会第二次调用构造方法生成另外一个对象
     *注意：在枚举类方法里面，在没定义枚举值之前，不要定义方法，不然编译无法通过
     * ***/

    //私有变量
    private Singleton singleton;

    //通过new在本类中创建一个本类对象，私有构造函数,防止被外部调用
    private SingletonEnum() {
        singleton=new Singleton();
    }

    //第三步：公有方法，供外部调用;注：为方便打印返回信息，故添加了一个返回值，正常情况使用SingletonEnum.ss1.getInstance2()；
    public Singleton getInstance1(){
        return singleton;
    }

    //第三步：公有方法，供外部调用
    public void getInstance2(){

    }

}
