package com.ycb.pattern.proxy;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/21 10:58
 *
 * 主要解决：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。
 * 在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
 * 直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 *
 * 何时使用：想在访问一个类时做一些控制。
 * 如何解决：增加中间层。
 * 关键代码：实现与被代理类组合。
 *
 * 步骤 3
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
 * 注意：display方法使用的是realImage对象的方法
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
