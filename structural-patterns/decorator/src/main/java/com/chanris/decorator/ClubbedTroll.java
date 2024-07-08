package com.chanris.decorator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class ClubbedTroll implements Troll{

    private final Troll decorated;

    public ClubbedTroll(Troll troll) {
        this.decorated = troll;
    }

    @Override
    public void attack() {
        decorated.attack(); // 原本的功能
        System.out.println("The troll swings at you with a club!"); // 附加的职能
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
