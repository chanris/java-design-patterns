package com.chanris.factorymethod;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class OrcWeapon implements Weapon{

    private final WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    @Override
    public String toString() {
        return "ORC Weapon:[" + weaponType.getTitle() + "]";
    }
}
