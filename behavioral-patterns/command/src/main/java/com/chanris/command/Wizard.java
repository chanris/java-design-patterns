package com.chanris.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 *
 */
public class Wizard {
    private final Deque<Runnable> undoStack = new LinkedList<>();
    private final Deque<Runnable> redoStack = new LinkedList<>();

    /**
     * 释放咒语
     */
    public void castSpell(Runnable runnable) {
        runnable.run();
        undoStack.offerLast(runnable); // offer操作会不会抛异常，返回值 为 true/false
    }

    /**
     * 重做上一个咒语
     */
    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            var previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.run(); // change 只有两种状态，再运行一次即撤销上一次的操作
        }
    }

    /**
     * 重做上一个咒语。
     */
    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            var previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
