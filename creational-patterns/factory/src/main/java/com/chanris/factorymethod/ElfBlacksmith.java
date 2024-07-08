package com.chanris.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class ElfBlacksmith implements Blacksmith{

    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new ElfWeapon(type);
    }
}
