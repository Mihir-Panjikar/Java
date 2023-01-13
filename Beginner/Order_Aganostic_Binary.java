package com.Beginner;

import java.util.Scanner;

public class Order_Aganostic_Binary { // order agnostic means that we are given a sorted array
                                      // but we don't know whether the array is sorted in ascending or descending order
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // case 1 ascending
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1}; // case 2 descending
        System.out.print("Enter target: ");
        int result = OrderAgnosticBS(arr2, in.nextInt());

        if (result == -1) System.out.println("Element not present");
        else System.out.println(result);
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                        start = mid + 1;
                }

                else {
                        end = mid - 1;
                }
            }

            else {
                if (arr[mid] > target) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
