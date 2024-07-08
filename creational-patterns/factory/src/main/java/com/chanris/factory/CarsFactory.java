package com.chanris.factory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/6
 * @description
 *
 */
public class CarsFactory {
    public static Car getCar(CarType type) {
        return type.getConstructor().get(); // 调用new方法
    }
}
