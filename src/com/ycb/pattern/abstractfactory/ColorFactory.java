package com.ycb.pattern.abstractfactory;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 10:15
 *
 * 步骤 6
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        } else if(color.equalsIgnoreCase("Green")){
            return new Green();
        } else if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    @Override
    public Shape getShape(String shapeType){
        return null;
    }
}
