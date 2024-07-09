package com.chanris.state;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class PeacefulState implements State{

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " is calm and peaceful.");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " calms down.");
    }
}
