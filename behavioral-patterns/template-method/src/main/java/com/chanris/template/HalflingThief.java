package com.chanris.template;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 半身人盗贼
 */
public class HalflingThief {

    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}
