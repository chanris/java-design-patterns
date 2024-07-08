package com.chanris.observer;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        System.out.printf("The hobbits are facing %s weather now\n", currentWeather.getDescription());
    }
}
