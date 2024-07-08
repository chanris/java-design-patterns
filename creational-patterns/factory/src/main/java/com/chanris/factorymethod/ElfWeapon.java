package com.chanris.factorymethod;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 精灵武器
 */
public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return  this.weaponType;
    }

    @Override
    public String toString() {
        return "ELF Weapon:[" + weaponType.getTitle() + "]";
    }
}
