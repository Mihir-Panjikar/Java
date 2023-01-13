package com.Problems;

import java.util.Arrays;
import java.util.Scanner;

//Number <= target and the largest number possible
//code almost similar to ceiling number code
public class Floor_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int len = in.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[len];
        input(arr);
        System.out.print("Enter target: ");
        int[] result = Flooring_Binary(arr, in.nextInt());
        System.out.println();
        if(result[0] == -1) System.out.println("Flooring not possible");
        else System.out.println(Arrays.toString(result));
    }

    static int[] Flooring_Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return new int[] {arr[mid],mid};
            }

            else if (target < arr[mid]) {
                end =  mid - 1;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }

        }

        if(end < 0) return new int[] {-1,-1};

        return new int[] {arr[end],end};

    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
}
