package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class HealingPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("You feel healed. (Potion={%d})\n", System.identityHashCode(this));
    }
}
