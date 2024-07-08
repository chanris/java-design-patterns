package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 命令，又称事务模式
 * 将请求封装为对象，从而使你可以将具有不同请求的客户端参数化，队列
 * Command设计模式是Java编程中使用的一种行为模式。它将请求封装为对象，
 * 从而允许使用队列、请求和操作对客户机进行参数化。
 * 此模式还支持可撤销操作，增强了管理和执行命令的灵活性。
 */
public class App {
    public static void main(String[] args) {
        var wizard = new Wizard();
        var goblin = new Goblin();
        goblin.printStatus();
        wizard.castSpell(goblin::changeSize);
        goblin.printStatus();
        wizard.castSpell(goblin::changeVisibility);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();
    }
}
