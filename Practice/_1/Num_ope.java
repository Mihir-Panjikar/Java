package com.Practice._1;

import java.util.Scanner;

public class Num_ope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers and the operation to be performed: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().charAt(0);
        int result = 0;

        if(op == '+') {
            result = num1 + num2;
        }

        else if(op == '-') {
            result = num1 - num2;
        }

        else if(op == '*') {
            result = num1 * num2;
        }

        else if(op == '/') {
            result = num1 / num2;
        }

        System.out.println("Result: " + result);
    }
}
