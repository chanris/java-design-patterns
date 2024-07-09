package com.chanris.state;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class Mammoth {
    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    // 让猛犸象的时间流逝。
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        }else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}
