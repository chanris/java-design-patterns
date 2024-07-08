package com.chanris.memento;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public enum StarType {
    SUN("sun"),
    RED_GIANT("red giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead star");
    private final String title;
    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
