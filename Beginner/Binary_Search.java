package com.Beginner;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter target: ");
        int result = Binary(arr, in.nextInt());

        if (result == -1) System.out.println("Element not present");
        else System.out.println(result);
    }

    static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2; // better method to get mid value

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
