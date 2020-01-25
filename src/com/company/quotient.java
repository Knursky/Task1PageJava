package com.company;
import java.util.Scanner;
public class quotient {
    public void countquotient(){
        Scanner scan = new Scanner(System.in);
        System.out.println("liczba nr 1?");
        double liczba1 = scan.nextInt();
        System.out.println("liczba nr 2?");
        double liczba2 = scan.nextInt();
        double sum = liczba1 / liczba2;
        System.out.println("Suma = "+sum);

    }
}
