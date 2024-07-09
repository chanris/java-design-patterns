package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class App {
    /**
     * Program entry point.
     * @param args
     */
    public static void main(String[] args) {
        var commander = new Commander(
                new Sergeant(new Soldier(), new Soldier(), new Soldier()),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );

        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
