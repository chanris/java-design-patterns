package com.chanris.template;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description SubtleMethod implementation of {@link StealingMethod}.
 */
public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach ths " + target + " with tears running and hug him!");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("while in close contact grab the " +  target + "'s wallet.");
    }
}
