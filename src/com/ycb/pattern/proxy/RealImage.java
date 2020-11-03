package com.ycb.pattern.proxy;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 10:54
 *
 * 步骤 2
 * 创建实现图片展示接口的实体类：真实图片
 * 并新增加载图片方法
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    //加载图片方法
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
