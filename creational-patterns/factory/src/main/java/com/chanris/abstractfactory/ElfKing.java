package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven King!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
