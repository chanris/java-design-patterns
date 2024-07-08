package com.chanris.flyweight;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class HolyWaterPotion implements Potion{
    @Override
    public void drink() {
        // 知识点：System.identityHashCode 获得jvm生成的hashcode，是根据对象内存生成的，object.hashcode() 获得的hashcode 是
        // 有可能被子类覆盖重写的，而System.identityHashCode 不会返回子类重写的Hashcode
        System.out.printf("You feel blessed. (Potion={%d})\n", System.identityHashCode(this));
    }
}
