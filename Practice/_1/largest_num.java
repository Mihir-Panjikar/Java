package com.Practice._1;

import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is the largest");
        }

        else System.out.println(num2 + " is the largest");
    }
}
