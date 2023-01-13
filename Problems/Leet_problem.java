package com.Problems;

import java.util.Scanner;

public class Leet_problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row and column");
        int person = in.nextInt();
        int account = in.nextInt();
        int[][] arr = new int[person][account];
        System.out.println("Enter elements in the array");
        input(arr);
        int richest = max(arr);
        System.out.println(richest);

    }

    static void input(int[][] arr) {
        Scanner in = new Scanner(System.in);
        for (int person = 0; person < arr.length; person++) {
            for (int account = 0; account < arr[person].length; account++) {
                arr[person][account] = in.nextInt();
            }
        }
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int total = 0;
            for (int account = 0; account < arr[person].length; account++) {
                total += arr[person][account];
            }
            if (max < total) {
                max = total;
            }
        }
        return max;
    }

//    static void print(int[][] arr) {
//        for (int[] ints : arr) {
//            System.out.println(Arrays.toString(ints));
//        }
//    }
}
