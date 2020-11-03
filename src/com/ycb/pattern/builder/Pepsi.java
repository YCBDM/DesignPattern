package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:36
 *
 * 创建一杯冷饮：百事
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 40.5f;
    }
}
