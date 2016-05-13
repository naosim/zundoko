package com.company.domain.base;


import java.util.ArrayList;
import java.util.List;

/**
 * コンサートホール
 * 人が喋ると全員に聞こえる
 */
public class Hall {
    private final List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
        person.enterHall(this);
    }

    public void onSay(Word word) {
        // ホールに響き渡る声を出力
        System.out.println(word.getValue());

        persons.stream().forEach(p -> p.hear(word));
    }
}