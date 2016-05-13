package com.company.domain.base;

import java.util.Optional;

/**
 * 人
 * 言う、聞く
 */
public abstract class Person {
    private Optional<Hall> hall = Optional.empty();


    public void enterHall(Hall hall) {
        this.hall = Optional.ofNullable(hall);
    }

    protected void say(Word word) {
        hall.ifPresent(h -> h.onSay(word));
    }

    public abstract void hear(Word word);
}