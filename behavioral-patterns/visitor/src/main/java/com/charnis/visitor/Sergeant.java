package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class Sergeant extends Unit {
    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "sergeant";
    }
}