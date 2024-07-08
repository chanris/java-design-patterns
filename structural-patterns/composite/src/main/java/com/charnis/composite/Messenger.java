package com.charnis.composite;

import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Messenger {
    LetterComposite messageFromOrcs() {
        var words = List.of(
                new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')
        );
        return new Sentence(words);
    }

    LetterComposite messageFromElves() {

        var words = List.of(
                new Word('M', 'u', 'c', 'h'),
                new Word('w', 'i', 'n', 'd'),
                new Word('p', 'o', 'u', 'r', 's'),
                new Word('f', 'r', 'o', 'm'),
                new Word('y', 'o', 'u', 'r'),
                new Word('m', 'o', 'u', 't', 'h')
        );

        return new Sentence(words);

    }
}
