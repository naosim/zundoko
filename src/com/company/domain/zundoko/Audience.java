package com.company.domain.zundoko;

import com.company.domain.base.Person;
import com.company.domain.base.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * 観客
 * 「ズン, ズン, ズン, ズン, ドコ」を聞くと「キヨシ」と言ってしまう人
 */
public class Audience extends Person {
    private final LastWordsMatcher lastWordsMatcher = new LastWordsMatcher(ZundokoWord.ズン, ZundokoWord.ズン, ZundokoWord.ズン, ZundokoWord.ズン, ZundokoWord.ドコ);
    private final List<Word> memory = new ArrayList<>();

    @Override
    public void hear(Word word) {
        memory.add(word);
        if(lastWordsMatcher.isMatch(memory)) {
            say(ZundokoWord.キヨシ);
        }
    }

}