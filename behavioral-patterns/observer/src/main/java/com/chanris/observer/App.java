package com.chanris.observer;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description Java 中的观察者模式： 掌握 Java 应用程序中的反应式接口
 * 学习 Java 中的观察者设计模式。了解其意图、适用性和实际示例。了解它如何促进松散耦合和动态观察者管理。软件开发人员和架构师的理想之选"。
 * Java 中的观察者模式定义了对象之间一对多的关系，确保当一个对象更新其状态时，
 * 所有依赖的观察者都会收到通知并自动更新，从而提高系统的响应速度和模块化程度。
 */
public class App {
    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();


    }
}
