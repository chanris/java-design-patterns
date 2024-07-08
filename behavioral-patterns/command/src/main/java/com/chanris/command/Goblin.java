package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 地精是咒语的目标。
 */
public class Goblin extends Target {
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
