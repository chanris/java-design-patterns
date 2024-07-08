package com.chanris.proxy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description 代理模式：为另一个对象提供代理或占位符以控制对其的访问。
 * 适用性：
 * 代理适用于需要比简单指针更广泛或更复杂的对象引用的情况。这是代理模式适用的几种常见情况。
 *
 * 1.远程代理为不同地址空间中的对象提供了本地代表。
 * 2.虚拟代理根据需要创建昂贵的对象。
 * 3.保护代理控制对原始对象的访问。当对象有不同的接入权限时保护代理很有用。
 */
public class App {
    public static void main(String[] args) {
        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
    }
}
