package com.charnis.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public abstract class LetterComposite {
    private final List<LetterComposite> children = new ArrayList<>(); // 组合的子节点

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    // 定义每个组合对象，都会做的事情
    protected void printThisBefore() {}

    // 定义每个组合对象，都会做的事情
    protected void printThisAfter() {}

    // 递归调用每个LetterComposite 都会做的事情（以统一的方式对待各个对象）
    public void print() {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }
}
