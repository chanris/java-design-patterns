package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class PoisonPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("Urgh! This is poisonous. (Potion={%d})\n", System.identityHashCode(this));
    }
}
