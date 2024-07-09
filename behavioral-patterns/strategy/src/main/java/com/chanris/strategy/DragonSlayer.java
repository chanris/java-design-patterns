package com.chanris.strategy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 屠龙勇士使用不同的策略来屠龙。
 */
public class DragonSlayer {
    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}
