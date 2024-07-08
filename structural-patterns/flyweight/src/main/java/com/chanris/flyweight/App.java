package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 * 享元模式：是通过在多个实体之间分享对象实例实现最大化内存使用效率。
 *
 * Flyweight（享元）模式的主要目标：是在类似对象之间共享尽可能多的数据，从而提高效率和性能。
 */
public class App {
    public static void main(String[] args) {
        var alchemistShop = new AlchemistShop();
        alchemistShop.drinkPotions();
    }
}
