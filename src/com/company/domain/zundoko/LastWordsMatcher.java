package com.company.domain.zundoko;

import com.company.domain.base.Word;

import java.util.List;

public class LastWordsMatcher {
    private final Word[] words;

    public LastWordsMatcher(Word... words) {
        this.words = words;
    }

    public boolean isMatch(List<Word> memoryWords) {
        if(memoryWords.size() < this.words.length) {
            return false;
        }
        List<Word> lastMemoryWords = memoryWords.subList(memoryWords.size() - words.length, memoryWords.size());
        for(int i = 0; i < this.words.length; i++) {
            if(lastMemoryWords.get(i) != this.words[i]) {
                return false;
            }
        }

        return true;
    }
}