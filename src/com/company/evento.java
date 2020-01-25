package com.company;

public class evento {
    public void countEven(){
        int sto = 100;
        for (int liczba = 2; liczba <= sto; liczba++) {
            if (liczba % 2 == 0) {
                System.out.println(liczba + " ");
            }

        }
    }
}


