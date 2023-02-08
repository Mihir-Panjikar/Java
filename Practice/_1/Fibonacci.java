package com.Practice._1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int fibo = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.print(num1+" "+num2+", ");
        for (int i = fibo-2; i > 0; i--) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + ", ");
        }
    }
}
