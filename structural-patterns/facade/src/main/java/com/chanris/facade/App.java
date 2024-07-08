package com.chanris.facade;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description 外观（门面）：为一个子系统中的一些列接口提供一个统一的接口。外观定义了一个更高级别的接口以便子系统更容易使用。
 *
 * 一个金矿是如何运作的？ 首先需要多个不同功能的矿工，比如开车云矿的工人，开采矿物的工人，爆破开路的工人；
 * 有机的调用这些工人的功能，就构成了一个金矿的运作。如何更容易的调用这些工人的方法，一个简单的想法是是把这些方法封装成
 * 一个更大的方法以供客户端调用。这就是门面的作用。
 */
public class App {
    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewsDay();
        facade.digOutGold();
        facade.endDay();
    }
}
