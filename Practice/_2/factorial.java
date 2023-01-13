package com.Practice._2;

import java.util.Scanner;
//Input a number and print all the factors of that number (use loops).
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fact = in.nextInt();

        for(int i = 0; i < fact ; i++) {
            double prod = 1;
            for (int j = i; j > 0 ; j--) {
                prod *= j;
            }
            System.out.print(prod + ", ");
        }
    }
}
