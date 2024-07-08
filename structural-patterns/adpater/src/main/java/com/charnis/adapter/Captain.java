package com.charnis.adapter;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 * 假设船长只会划船，但不会航行
 */
public class Captain {
    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
