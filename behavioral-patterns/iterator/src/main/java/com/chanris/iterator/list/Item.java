package com.chanris.iterator.list;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class Item {
    private ItemType type;
    private final String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }
}
