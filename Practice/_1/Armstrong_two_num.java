package com.Practice._1;

import java.util.Scanner;

public class Armstrong_two_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers consisting of 3 digits");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int temp1 = num1, temp2 = num2;
        int sum1 = 0, sum2 = 0;

        while(temp1 != 0) {
            sum1 += (int) Math.pow(temp1 % 10,3);
            temp1 /= 10;
        }
        if(sum1 == num1) {
            System.out.println(num1 + " is an armstrong number");
        }
        else System.out.println(num1 + " is not an armstrong number");


        while(temp2 != 0) {
            sum2 += (int) Math.pow(temp2 % 10,3);
            temp2 /= 10;
        }
        if(sum2 == num2) {
            System.out.println(num2 + " is an armstrong number");
        }
        else System.out.println(num2 + " is not an armstrong number");
    }
}
