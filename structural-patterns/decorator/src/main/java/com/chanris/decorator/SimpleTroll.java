package com.chanris.decorator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description troll 巨魔
 */
public class SimpleTroll implements Troll{
    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!"); // grab 抓
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    // flee 逃避
    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
