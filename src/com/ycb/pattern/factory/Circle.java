package com.ycb.pattern.factory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:12
 *步骤 2
 * 创建实现接口的实体类：
 * 用形状接口实现圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method!");
    }
}
