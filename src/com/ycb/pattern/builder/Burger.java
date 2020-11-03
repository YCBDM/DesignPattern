package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:25
 *
 * 步骤 3
 * 创建实现 菜单列表Item 接口的抽象类，该类提供了默认的功能：包含包装，价格
 *
 */
public abstract class Burger implements Item{

    //包装
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    //价格
    @Override
    public abstract float price();
}
