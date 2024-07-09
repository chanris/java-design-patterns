package com.chanris.strategy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 枚举策略模式的 Lambda 实现。
 */
public class LambdaStrategy  {
    public enum Strategy implements DragonSlayingStrategy {
        MELEE_STRATEGY(()->{
            System.out.println("With your exaclibur you server the dragon's head");
        }),
        PROJECTILE_STRATEGY(()->{
            System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
        }),
        SPELL_STRATEGY(()->{
            System.out.println("You cast the spell of disintegration and dragon vaporizes in a pile of dust!");
        });

        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy strategy) {
            dragonSlayingStrategy = strategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
