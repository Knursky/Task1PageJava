package com.company;

import java.util.Scanner;

public class sumintegers {
    public void countsum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("liczba nr 1?");
        int liczba1 = scan.nextInt();
        System.out.println("liczba nr 2?");
        int liczba2 = scan.nextInt();
        int sum = liczba1 + liczba2;
        System.out.println("Suma = "+sum);
    }
}

