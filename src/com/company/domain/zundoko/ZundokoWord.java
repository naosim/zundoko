package com.company.domain.zundoko;


import com.company.domain.base.Word;

public enum ZundokoWord implements Word {
    ズン,
    ドコ,
    キヨシ;

    public String getValue() {
        return this.toString();
    }
}