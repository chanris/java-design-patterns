package com.chanris.mediator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public enum Action {
    HUNT("hunted a rabbit", "arrives for dinner"),
    TALE("tells a tale", "comes to listen"),
    GOLD("found gold", "takes his share of the gold"),
    ENEMY("spotted enemies", "runs for cover"),
    NONE("", "");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return title;
    }
}
