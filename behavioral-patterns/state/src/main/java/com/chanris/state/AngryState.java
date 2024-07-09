package com.chanris.state;


/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class AngryState implements State {
    private final Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " is furious!");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " gets angry!");
    }
}
