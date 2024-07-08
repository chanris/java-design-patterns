package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 懒汉式单例
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() { // 需要考虑线程安全
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
