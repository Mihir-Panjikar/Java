package com.basics;

import java.util.Scanner;

public class MinMax_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter array elements");
        input(arr);
        int min = Min(arr);
        int max = Max(arr);
        System.out.println("Minimum number in array is " + min);
        System.out.println("Maximum number in array is " + max);
    }

    static int Min(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int Max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

}
