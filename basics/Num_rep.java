package com.basics;

import java.util.Scanner;

public class Num_rep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter a number to look for: ");
        int num_check = in.nextInt();

        int count = 0;

        while (num > 0){
            int rem = num % 10;
            if (rem == num_check){
                count++;
            }
            num /= 10;
        }

        System.out.println("Number " + num_check + " is repeated " + count + " times");
    }
}
