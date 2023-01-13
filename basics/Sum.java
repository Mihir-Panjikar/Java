package com.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner Input = new Scanner(System.in);

        int num1 = Input.nextInt();
        int num2 = Input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
