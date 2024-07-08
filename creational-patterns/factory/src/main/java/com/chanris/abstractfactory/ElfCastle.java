package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
