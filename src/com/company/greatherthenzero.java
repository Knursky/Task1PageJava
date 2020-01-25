package com.company;

import java.util.Scanner;

public class greatherthenzero {
    public void countgreatherthenzero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Check if your number is positive (greater then 0)");
        System.out.println("Your Number?");
        int liczba = scan.nextInt();
        if (liczba > 0) {
            System.out.println("Yes "+liczba+" is greater then 0");}
        else {
            System.out.println("Unfortunately   "+liczba+" is 0 or lower then 0");
        }
    }
}
