package com.charnis.visitor;

import java.util.Arrays;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 层次结构中节点的接口。
 */
public abstract class Unit {
    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
