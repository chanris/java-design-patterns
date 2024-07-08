package com.chanris.factory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/6
 * @description 测试工厂
 * 工厂、简单工厂、静态工厂方法
 * 适用场景：只关心对象的创建，但不关心如何创建、管理它的时候，使用简单工厂模式。
 * 优点：
 * 1. 可以把对象创建代码集中在一个地方，避免在代码库散布“new”关键字
 * 2. 可以让代码更加低耦合。它的一些主要优点包括更好的可测试性、更好的可读性、组件可替换性、可拓展性、更好的隔离性
 * 缺点：
 * 会使代码变得比原来更复杂一些
 */
public class App {
    public static void main(String[] args) {
        Car car = CarsFactory.getCar(CarType.FERRARI);
        System.out.println(car.getDescription());
    }
}
