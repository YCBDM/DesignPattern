package com.ycb.pattern.proxy;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 11:03
 */
public class UseProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
