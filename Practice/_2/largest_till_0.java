package com.Practice._2;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class largest_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers and enter 0 to get largest among them");
        int num, largest = 0;

        do {
            num = in.nextInt();
            if(largest < num) largest = num;
        } while (num != 0);

        System.out.println("largest: " + largest);
    }
}
