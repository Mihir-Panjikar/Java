package com.basics;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        boolean arm = isArm(num);
        System.out.println(arm);

        for (int i = 100; i < 1000; i++) {
            if (isArm(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArm(int num) {
        int num2 = num;
        int sum = 0;

        while (num2 > 0) {
            int dig = num2 % 10;
            sum += dig * dig * dig;
            num2 /= 10;
        }

        return sum == num;
    }
}
