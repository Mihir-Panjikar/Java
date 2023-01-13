package com.Problems;

import java.util.Arrays;
import java.util.Scanner;

//Binary search is ran twice to find first and last occurrence of the target
public class First_last_pos_sort_arr_Leet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int len = in.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[len];
        input(arr);
        System.out.print("Enter target: ");
        int[] result = search(arr, in.nextInt());
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid] || target == arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        int first = start;
        start = 0;
        end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid] || target == arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

        }
        int last = end;

        if (first != target && last != target) {
            return new int[] {-1,-1};
        }

        return new int[] {first,last};
    }

    //tutorial code below
    int search (int[] nums,int target, boolean FindStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid -1;
            }

            else if (target > nums[mid]) {
                start = mid + 1;
            }

            else {
                ans = mid;
                if (FindStartIndex) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
}
