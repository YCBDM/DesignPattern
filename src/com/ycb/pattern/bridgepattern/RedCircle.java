package com.ycb.pattern.bridgepattern;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 7:47
 *
 * 步骤 2
 * 创建实现了 DrawAPI 接口的实体桥接实现类
 */
public class RedCircle implements DrawAPI {
    //画一个红色的圆
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

    @Override
    public void drawSquare(int x) {
        //do Nothing
    }
}
