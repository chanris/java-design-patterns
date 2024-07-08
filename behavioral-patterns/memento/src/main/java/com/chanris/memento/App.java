package com.chanris.memento;

import java.util.Stack;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description Java 中的 Memento 设计模式允许开发人员在不违反封装的情况下捕获和还原对象的内部状态。
 * 了解如何在 Java 中实现 Memento 设计模式，以便在不违反封装的情况下捕获和还原对象状态。是应用程序中撤消功能的理想选择。
 * Memento 模式可以捕捉对象的内部状态，从而便于在任何时间点存储和还原对象。
 */
public class App {
    public static void main(String[] args) {
        var states = new Stack<StarMemento>();

        var star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        while (!states.isEmpty()) {
            star.setMemento(states.pop());
            System.out.println(star);
        }

    }
}
