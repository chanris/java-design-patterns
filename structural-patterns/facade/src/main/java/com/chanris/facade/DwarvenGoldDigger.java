package com.chanris.facade;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class DwarvenGoldDigger extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
