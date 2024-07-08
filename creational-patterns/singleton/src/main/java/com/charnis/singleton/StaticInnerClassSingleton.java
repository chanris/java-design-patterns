package com.charnis.singleton;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class StaticInnerClassSingletonHelper {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHelper.instance;
    }

}
