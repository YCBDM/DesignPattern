package com.ycb.pattern.bridgepattern;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 7:46
 *
 * 步骤 1
 * 创建桥接实现接口：此接口具有画图形的功能
 */

/**
 * @doc
 * 接口功能：画一个圆（大小不限）
 * */
public interface DrawAPI {
        //画一个圆
        public void drawCircle(int radius, int x, int y);
        //画一个正方形
        public void drawSquare(int x);
}
