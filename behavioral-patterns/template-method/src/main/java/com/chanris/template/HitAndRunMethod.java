package com.chanris.template;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class HitAndRunMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " from behind." );
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
