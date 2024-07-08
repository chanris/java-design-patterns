package com.charnis.composite;

import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Word extends LetterComposite{
    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }
    public Word(char... letters) {
        for (char c: letters) {
            this.add(new Letter(c));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
