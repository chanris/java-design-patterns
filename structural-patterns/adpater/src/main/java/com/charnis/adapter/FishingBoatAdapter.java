package com.charnis.adapter;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class FishingBoatAdapter implements RowingBoat{
    private final FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
