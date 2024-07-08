package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 * 这种方式不仅简洁，而且天然地支持序列化机制来防止反序列化重新创建新的对象，且绝对防止多次实例化，是实现单例模式的最佳方法。
 *
 * 枚举类为什么是单例的？
 * 1.枚举类都继承java.lang.enum
 * 2.私有了构造器，这就是为什么枚举类的构造器为什么可以不（也不能）显示的声明 封装范围，因为都是private
 * 3.在类加载/初始化过程创建了枚举类实例。此后使用的都是同一个对象。
 * 4.枚举类在序列化和反序列时能够保证单例特性。这是JVM保证的
 * 5.枚举类在反射机制也做了限制，即使通过反射也不能创建新的枚举实例。尝试创建，会抛异常
 */
public enum EnumIvoryTower {
    INSTANCE;

    // 其他方法
    public void someMethod() {
        // 实现逻辑
    }
}
