package com.chanris.builder;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public enum Armor {
    CHAIN_MAIL("锁子甲"),
    CLOTHES("布甲"),
    LEATHER("皮革"),
    PLATE_MAIL("板甲");
    private final String title;
    Armor(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
