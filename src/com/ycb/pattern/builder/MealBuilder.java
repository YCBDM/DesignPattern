package com.ycb.pattern.builder;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/25 7:50
 *
 * 步骤 6
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal套餐对象
 * 通过不同套餐名称包含不同冷饮、憨包对象来实现
 */
public class MealBuilder  {

    //VegMeal套餐包含Veg憨包，拿铁冷饮
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    //NonVegMeal套餐包含鸡腿汉堡，百事可乐
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
