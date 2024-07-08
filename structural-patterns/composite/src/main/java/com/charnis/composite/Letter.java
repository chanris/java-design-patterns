package com.charnis.composite;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Letter extends LetterComposite {
    private final char character;
    public Letter(char c) {
        this.character = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }

}
