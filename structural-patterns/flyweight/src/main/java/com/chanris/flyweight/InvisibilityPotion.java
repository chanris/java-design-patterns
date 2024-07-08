package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class InvisibilityPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("You become invisible, (Potion={%d})\n", System.identityHashCode(this));
    }
}
