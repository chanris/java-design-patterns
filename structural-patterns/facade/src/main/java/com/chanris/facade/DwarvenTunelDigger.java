package com.chanris.facade;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class DwarvenTunelDigger extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println(name() + " creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunel digger";
    }
}
