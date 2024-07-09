package com.chanris.template;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public abstract class StealingMethod {
    protected abstract String pickTarget();
    protected abstract void confuseTarget(String target);
    protected abstract void stealTheItem(String target);

    public final void steal() {
        var target = pickTarget();
        System.out.println("The target has been chosen as " + target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
