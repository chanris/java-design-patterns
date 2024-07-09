package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Hello " + sergeant);
    }

    @Override
    public void visit(Commander commander) {
        // Do nothing
    }
}
