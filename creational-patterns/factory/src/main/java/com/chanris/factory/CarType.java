package com.chanris.factory;

import java.util.function.Supplier;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/6
 * @description
 * todo Ford::new 和 Supplier<T> 有什么关系
 */
public enum CarType {

    FORD(Ford::new),
    FERRARI(Ferrari::new);

    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return this.constructor;
    }
}
