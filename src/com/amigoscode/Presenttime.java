package com.amigoscode;

import java.time.LocalDate;

public class Presenttime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getYear());


    }
}
