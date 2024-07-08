package com.chanris.proxy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Wizard {
    private final String name;
    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
