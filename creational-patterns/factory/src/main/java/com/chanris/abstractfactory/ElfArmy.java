package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
