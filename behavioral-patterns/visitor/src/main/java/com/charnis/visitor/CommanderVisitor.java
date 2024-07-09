package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        // do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        // do nothing
    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you " + commander);
    }
}
