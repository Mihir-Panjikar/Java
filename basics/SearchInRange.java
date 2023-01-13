package com.basics;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a array size: ");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter values");
        input(arr);
        System.out.print("Enter target: ");
        int target = in.nextInt();
        System.out.println("Enter the range for the search");
        int start = in.nextInt();
        int end = in.nextInt();

        boolean result = search(arr, target, start, end);

        if (result) System.out.println("Number is present");
        else System.out.println("Number is not present");

    }

    static boolean search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return true;
            }
        }

        return false;
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

}
