package com.company;

import java.util.Scanner;

public class range {
    public void countrange(){
        Scanner scan = new Scanner(System.in);
        int liczba=0;
        System.out.println("Your Number?");
        int liczba1 = scan.nextInt();
        System.out.println("Your Number?");
        int liczba2 = scan.nextInt();
        if (liczba1<liczba2) {
            System.out.println("Numbers:" + (liczba2 - liczba1 - 1));

            for (int i = liczba1 + 1; i < liczba2; i++)

                System.out.println(i + " ");
        }
        else {
            System.out.println("Numbers : " + (liczba1 - liczba2 - 1));

            for (int i = liczba2 + 1; i < liczba1; i++)
                System.out.print(i + "");


    }
    }
}
