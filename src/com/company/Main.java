package com.company;

import com.company.domain.base.Hall;
import com.company.domain.zundoko.Audience;
import com.company.domain.zundoko.SingerKiyoshi;

public class Main {

    public static void main(String[] args) {
        SingerKiyoshi kiyoshi = new SingerKiyoshi();
        Audience audience = new Audience();

        Hall hall = new Hall();
        hall.addPerson(kiyoshi);
        hall.addPerson(audience);

        kiyoshi.sing();
    }
}
