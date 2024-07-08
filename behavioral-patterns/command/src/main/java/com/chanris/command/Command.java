package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public interface Command {
    void execute(Target target);
    void undo();
    void redo();
    String toString();
}
