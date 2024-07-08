package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 单例：确保一个类只有一个实例，并为其提供一个全局访问点
 */
public class App {
    public static void main(String[] args) {
        /**
         * java 枚举类的设计 就是单例
         */
        EnumIvoryTower instance = EnumIvoryTower.INSTANCE;
        EnumIvoryTower instance2 = EnumIvoryTower.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.equals(instance2));
    }
}
