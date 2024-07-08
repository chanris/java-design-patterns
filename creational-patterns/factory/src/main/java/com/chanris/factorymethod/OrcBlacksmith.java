package com.chanris.factorymethod;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 兽人铁匠
 */
public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new OrcWeapon(type);
    }
}
