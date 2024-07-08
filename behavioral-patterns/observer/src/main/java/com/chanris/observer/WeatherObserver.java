package com.chanris.observer;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 观察者接口
 */
public interface WeatherObserver {
    void update(WeatherType currentWeather);
}
