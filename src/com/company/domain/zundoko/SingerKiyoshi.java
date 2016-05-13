package com.company.domain.zundoko;


import com.company.domain.base.Person;
import com.company.domain.base.Word;

import java.util.Random;

import static com.company.domain.zundoko.ZundokoWord.キヨシ;
import static com.company.domain.zundoko.ZundokoWord.ズン;
import static com.company.domain.zundoko.ZundokoWord.ドコ;

/**
 * 氷川 きよしは、日本の演歌歌手である。
 * 観客の「キヨシ」を聞くまで歌うのをやめない。
 */
public class SingerKiyoshi extends Person {
    private final Random random = new Random();
    private boolean isSinging;

    @Override
    public void hear(Word word) {
        if(word == ZundokoWord.キヨシ) {
            isSinging = false;
        }
    }

    public void sing() {
        isSinging = true;
        int count = 0;
        while(isSinging) {
            say(random.nextInt(2) == 0 ? ZundokoWord.ズン : ZundokoWord.ドコ);
            if(count++ > 100) {
                throw new RuntimeException("歌いすぎてノド崩壊");
            }
        }

    }
}