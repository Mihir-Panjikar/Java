package com.Practice._3;

import java.util.Scanner;

public class Min_max_methods {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = min(a, b, c);
        int max = max(a, b, c);

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    static int min(int a, int b, int c) {
        if(a < b && a < c) return a;
        else if(b < a && b < c) return b;
        else return c;
    }

    static int max(int a, int b, int c) {
        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else return c;
    }
}
