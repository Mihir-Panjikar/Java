package com.basics;

import java.util.Scanner;

public class Num_rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int rev = 0;

        while (num > 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }

        System.out.println("Reverse is " + rev);
    }
}
