package com.chanris.iterator.list;

import com.chanris.iterator.Iterator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class TreasureChestItemIterator implements Iterator<Item> {
    private final TreasureChest chest; // chest 胸部，箱子
    private int idx;
    private final ItemType type;

    public TreasureChestItemIterator(TreasureChest chest, ItemType itemType) {
        this.chest = chest;
        this.type = itemType;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextId() != -1;
    }

    @Override
    public Item next() {
        idx = findNextId();
        if (idx != -1) {
            return chest.getItems().get(idx);
        }
        return null;
    }

    private int findNextId() {
        var items = chest.getItems();
        var tempIdx = idx;
        while (true) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }
            if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }
}
