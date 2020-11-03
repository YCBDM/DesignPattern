package com.ycb.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:45
 *
 * 步骤 5
 * 创建一个套餐Meal类，带有上面定义的 Item 对象。
 */
public class Meal {

    //套餐列表
    private List<Item> items = new ArrayList<Item>();

    //增加一个套餐
    public void addItem(Item item){
        items.add(item);
    }

    //某一套餐价格
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    //展示套餐价格
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
