package com.ycb.pattern.bridgepattern;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 7:49
 *
 * 步骤 3
 * 使用 画图形DrawAPI接口创建形状抽象类 Shape，
 * 注：
 *  可以画任意一个形状的圆，也不一定是画一个圆，可扩展为画一个矩形，正方形等等
 */
public abstract class setShape {
    protected DrawAPI drawAPI;

    //依赖抽象的绘图接口
    protected setShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    //抽象方法draw();
    public abstract void draw();
}
