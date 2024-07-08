package com.chanris.proxy;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class IvoryTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }
}
