package com.ycb.pattern.abstractfactory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:06
 *步骤 2
 *  创建实现形状接口的子实体类：
 * 用形状接口实现长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method!");
    }
}
