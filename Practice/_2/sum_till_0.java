package com.Practice._2;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class sum_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers and enter 0 to get sum");
        int num, sum = 0;

        do {
            num = in.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum: " + sum);
    }
}
