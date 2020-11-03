package com.ycb.pattern.factory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:10、
 * 步骤 2
 * 创建实现接口的实体类：
 * 用形状接口实现正方形
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method!");
    }
}
