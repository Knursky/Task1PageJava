package com.company;

public class sumall {

    public static int sumAll(int... liczby) {

        int wynik = 0;
        for (int i = 0; i < liczby.length; i++) {
            wynik += liczby[i];
        }
        return wynik;
    }
}