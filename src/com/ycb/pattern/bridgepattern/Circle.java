package com.ycb.pattern.bridgepattern;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 7:55
 *
 * 步骤 4：将形状抽象类功能具体化
 * 新建实现了形状Shape抽象类的实体类，
 */
public class Circle extends setShape {
    private int x, y, radius;

    protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    //画一个圆
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
