package com.chanris.mediator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description Java中的中介模式:简化复杂系统中的对象通信
 * 中介者模式是一种行为设计模式， 能让你减少对象之间混乱无序的依赖关系。 该模式会限制对象之间的直接交互，
 * 迫使它们通过一个中介者对象进行合作。
 */
public class App {
    /**
     * Program entry point
     * @param args
     */
    public static void main(String[] args) {
        //创建派对 和 人员
        Party party = new PartyImpl();
        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rouge = new Rogue();
        var hunter = new Hunter();

        // 添加派对成员
        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rouge);
        party.addMember(hunter);

        // 执行动作->其他成员被派对通知
        hobbit.act(Action.ENEMY);
    }
}
