package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 双检锁式单例
 * 这种方式结合了懒汉式的延迟加载和饿汉式的高效率，使用双检查加锁机制能够确保线程安全
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
