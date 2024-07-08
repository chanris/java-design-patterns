package com.chanris.factorymethod;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 为创建一个对象定义一个接口，但让子类决定实例化哪个类。工厂方法允许类将实例化延迟到子类。
 * 适用场景：
 * 1.一个类无法预料它所要必须创建的对象的类
 * 2.一个类想要它的子类来指定它要创建的对象
 * 3.类将责任委派给几个帮助子类中的一个，而你想定位了解具体之中的哪一个
 */
public class Client {

    public static void main(String[] args) {
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon aex = elfBlacksmith.manufactureWeapon(WeaponType.AXE);
        Weapon spear = elfBlacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(aex);
        System.out.println(spear);
    }
}
