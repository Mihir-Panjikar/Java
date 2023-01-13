package com.Practice._2;

import java.util.Scanner;

// Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class Sum_of {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers and enter 0 to get sum");
        int num, neg_sum = 0, pos_odd_sum = 0, pos_even_sum = 0;

        do {
            num = in.nextInt();
            if (num < 0) neg_sum += num;
            else if (num > 0 && num % 2 != 0) pos_odd_sum += num;
            else if (num > 0) pos_even_sum += num;
        } while (num != 0);

        System.out.println("Negative sum: " + neg_sum);
        System.out.println("Positive odd sum: " + pos_odd_sum);
        System.out.println("Positive even sum: " + pos_even_sum);
    }
}
