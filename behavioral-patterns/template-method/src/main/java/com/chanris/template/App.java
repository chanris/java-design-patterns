package com.chanris.template;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description Java 中的模板方法模式： 用预定义脚手架简化复杂算法
 * 了解 Java 中模板方法模式的基本要素，包括它如何简化代码、提高可重用性并实现算法设计的灵活性。
 * 非常适合希望提高面向对象编程技能的开发人员。
 *
 * 在操作中定义算法的骨架，将某些步骤推迟到子类。模板方法允许子类在不改变算法结构的情况下重新定义算法的某些步骤。
 */
public class App {
    public static void main(String[] args) {
        var thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
