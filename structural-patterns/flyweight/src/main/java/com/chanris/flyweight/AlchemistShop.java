package com.chanris.flyweight;

import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class AlchemistShop {
    private final List<Potion> topShelf;
    private final List<Potion>  bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING)
        );
        bottomShelf = List.of(
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
    }

    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    public void drinkPotions() {
        System.out.print("Drinking top shelf potions\n");
        topShelf.forEach(Potion::drink);
        System.out.print("Drinking bottom shelf potions\n");
        bottomShelf.forEach(Potion::drink);
    }
}
