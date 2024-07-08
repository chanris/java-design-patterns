package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class OrcKing implements King {

    static final String DESCRIPTION = "This is the Orc King!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
