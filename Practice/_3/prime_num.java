package com.Practice._3;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        prime();
    }

    static void prime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                flag = false;
            }
        }

        if(flag) {
            System.out.println("Prime number");
        }

        else System.out.println("NOT Prime number");
    }
}
