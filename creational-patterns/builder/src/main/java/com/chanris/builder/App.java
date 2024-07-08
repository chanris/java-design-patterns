package com.chanris.builder;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 创建者模式
 * 将复杂对象的构造与其表示分开，以便统一构造过程可以创建不同的表示。
 */
public class App {
    public static void main(String[] args) {
        Hero riobard = new Hero.Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER).build();
        System.out.println(riobard);
    }
}
