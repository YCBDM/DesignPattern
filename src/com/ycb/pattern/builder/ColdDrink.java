package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:29
 *
 *创建抽象冷饮类，包含瓶子和未知的价格标签
 */
public abstract  class ColdDrink implements Item {

    //具体的瓶子
    @Override
    public Packing packing() {
        return new Bottle();
    }

    //用抽象方法实现价格标签
    @Override
    public abstract float price() ;
}
