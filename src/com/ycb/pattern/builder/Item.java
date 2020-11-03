package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:21
 *
 * 步骤 1
 * 创建一个表示食物条目和食物包装的接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
