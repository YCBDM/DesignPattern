package com.ycb.pattern.abstractfactory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:19
 * 步骤 8
 *  使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
 *
 * 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 */
public class UseAbstractFactory {
    public static void main(String[] args) {
        //获取形象工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        //获取形状为Circle的对象
        Shape circle = shapeFactory.getShape("Circle");
        //给圆形绘色
        circle.draw();
    }
}
