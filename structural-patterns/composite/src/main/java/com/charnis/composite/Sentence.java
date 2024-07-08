package com.charnis.composite;

import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Sentence extends LetterComposite{
    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
