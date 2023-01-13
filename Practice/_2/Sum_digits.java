package com.Practice._2;

import java.util.Scanner;

// Sum Of A Digits Of Number
public class Sum_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int sum = 0;

        while(num != 0) {
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
