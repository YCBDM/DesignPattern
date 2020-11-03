package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:23
 *
 * 步骤 2
 * 创建实现食物包装 Packing 接口的实体类:瓶子
 *
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
