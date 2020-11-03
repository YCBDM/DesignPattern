package com.ycb.pattern.abstractfactory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 18:43
 *
 * 步骤 7
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
