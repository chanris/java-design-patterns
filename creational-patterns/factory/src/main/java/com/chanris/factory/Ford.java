package com.chanris.factory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/6
 * @description
 */
public class Ford implements Car {

    static final String DESCRIPTION = "This is Ford.";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
