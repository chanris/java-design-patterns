package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        System.out.println("Greeting " + soldier);
    }

    @Override
    public void visit(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visit(Commander commander) {
        // Do nothing
    }
}
