package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public enum Size {
    SMALL("小"),
    NORMAL("正常");
    private final String title;
    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
