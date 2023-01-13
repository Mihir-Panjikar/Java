package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Rev_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter " + len + " numbers: ");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        rev_arr(arr,len-1);

        System.out.println(Arrays.toString(arr));
    }

    static void rev_arr(int[] arr, int end) {
        int start = 0;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
