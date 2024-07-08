package com.chanris.observer;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
