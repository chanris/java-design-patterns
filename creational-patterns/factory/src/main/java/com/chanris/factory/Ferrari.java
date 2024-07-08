package com.chanris.factory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/6
 * @description
 */
public class Ferrari implements Car{

    static final String DESCRIPTION = "This is Ferrari.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
