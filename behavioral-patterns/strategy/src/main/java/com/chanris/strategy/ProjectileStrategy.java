package com.chanris.strategy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class ProjectileStrategy implements DragonSlayingStrategy{
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
