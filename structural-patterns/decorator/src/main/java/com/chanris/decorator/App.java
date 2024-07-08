package com.chanris.decorator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description 装饰器：动态的为对象附加额外的职责。装饰器为子类提供了灵活的替代方案，以扩展功能。
 *
 * 装饰者模式让你可以在运行时通过把对象包装进一个装饰类对象中来动态的改变一个对象的行为。
 *
 * 动态透明地向单个对象添加职责，即不影响其他对象
 * 对于可以撤销的责任
 * 当通过子类化进行扩展是不切实际的。有时可能会有大量的独立扩展，并且会产生大量的子类来支持每种组合。 否则类定义可能被隐藏或无法用于子类化。
 */
public class App {
    public static void main(String[] args) {
        var troll = new SimpleTroll();
//        troll.attack();
//        troll.fleeBattle();

        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
    }
}
