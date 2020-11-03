package com.ycb.pattern.bridgepattern;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 8:08
 *
 *
 * 模式适用环境
 * 在以下情况下可以使用桥接模式：
 *     如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 *                  通过桥接模式可以使它们在抽象层建立一个关联关系。
 *     抽象化角色和实现化角色可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类的对象进行组合，
 *                  即系统需要对抽象化角色和实现化角色进行动态耦合。
 *     一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 *     虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
 *     对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
 *
 * 步骤 5
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆
 */
public class UseBridge {
    public static void main(String[] args) {
        setShape redCircle = new Circle(100, 100, 10, new RedCircle());
        setShape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
