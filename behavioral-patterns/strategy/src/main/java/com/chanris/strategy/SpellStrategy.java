package com.chanris.strategy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class SpellStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
