package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class StrengthPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("You feel strong. (Potion={%d})\n", System.identityHashCode(this));
    }
}
