package com.ycb.pattern.abstractfactory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:49
 * 步骤4：
 * 颜色接口的子类中实现颜色填充方法
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
