package com.chanris.strategy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class MeleeStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
