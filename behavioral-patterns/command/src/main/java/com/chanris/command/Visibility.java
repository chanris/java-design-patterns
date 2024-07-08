package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public enum Visibility {
    VISIBLE("可见"),
    INVISIBLE("不可见");
    private final String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
