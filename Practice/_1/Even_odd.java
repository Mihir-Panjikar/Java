package com.Practice._1;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is a even number");
        }
        else System.out.println(num + " is a odd number");
    }
}
