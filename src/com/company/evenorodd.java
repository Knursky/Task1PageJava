package com.company;

import java.util.Scanner;

public class evenorodd {
    public void countevenorodd() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Check if your number is even or odd ");
        System.out.println("Your Number?");
        int liczba = scan.nextInt();
        if (liczba % 2 == 0) {
            System.out.println("Hmm seems like " + liczba + " is even");
        } else {
            System.out.println("wow   " + liczba + " odd");
        }
    }
}
