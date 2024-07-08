package com.chanris.iterator;

import com.chanris.iterator.list.ItemType;
import com.chanris.iterator.list.TreasureChest;

import static com.chanris.iterator.list.ItemType.POTION;
import static com.chanris.iterator.list.ItemType.RING;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 迭代器模式是一种行为设计模式， 让你能在不暴露集合底层表现形式 （列表、 栈和树等） 的情况下遍历集合中所有的元素。
 */
public class App {
    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        System.out.println("------------------------");
        System.out.println("Item Iterator for ItemType " + itemType + ": ");
        var itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }
    }

    public static void main(String[] args) {
//        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
//        demonstrateTreasureChestIteratorForType(WEAPON);
//        demonstrateTreasureChestIteratorForType(ANY);

    }
}
