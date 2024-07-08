package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 饿汉式单例
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
