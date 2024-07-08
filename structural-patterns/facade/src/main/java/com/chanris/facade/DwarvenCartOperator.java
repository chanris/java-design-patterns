package com.chanris.facade;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class DwarvenCartOperator extends DwarvenMineWorker{
    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
