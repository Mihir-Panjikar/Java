package com.Beginner;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string length:");
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter element to be found: ");
        int find = in.nextInt();

        int loc = Linear(find, arr);

        if ( loc == -1) {
            System.out.println("Element not present");
        }

        else {
            System.out.println("Element is present at " + loc + " index");
        }

    }

    static int Linear(int find, int[] arr) {

        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
