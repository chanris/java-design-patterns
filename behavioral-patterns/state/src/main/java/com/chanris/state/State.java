package com.chanris.state;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public interface State {
    void onEnterState();
    void observe();
}
