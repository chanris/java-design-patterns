package com.chanris.factorymethod;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public enum WeaponType {
    AXE("斧头"),
    SHORT_SWORD("短剑"),
    SPEAR("长矛"),
    UNDEFINED("未知");
    private final String title;

    WeaponType(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
