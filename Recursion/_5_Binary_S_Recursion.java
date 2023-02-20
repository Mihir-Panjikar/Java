package com.Recursion;

public class _5_Binary_S_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(Binary_R(arr, target, 0 , arr.length-1));
    }

    static int Binary_R(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end-start)/2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return Binary_R(arr, target, start, mid-1);
        }

        return Binary_R(arr, target, mid +1, end);
    }
}
