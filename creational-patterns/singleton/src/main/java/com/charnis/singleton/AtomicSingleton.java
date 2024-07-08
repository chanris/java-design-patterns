package com.charnis.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 原子引用实现单例
 */
public class AtomicSingleton {
    private static final AtomicReference<AtomicSingleton> instance = new AtomicReference<>();

    private AtomicSingleton() {}

    public static AtomicSingleton getInstance() {
        for (;;) {
            AtomicSingleton current = instance.get();
            if (current != null) {
                return current;
            }
            current = new AtomicSingleton();
            if (instance.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
