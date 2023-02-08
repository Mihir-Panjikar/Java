package com.basics;

import java.util.Scanner;

public class Pri_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        return c * c > n;
    }

}
