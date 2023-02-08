package com.Problems;

public class Pos_infi_sort_arr_amazon {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int ans = ans(arr,target);
        System.out.println("Element is at " + ans);
    }

    static int ans(int[] arr,int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1;
            //double the box value
            end = end + (end-start + 1) * 2;
            start = newStart;
        }

        return Binary(arr,target,start,end);
    }
    static int Binary(int[] arr, int target,int start,int end) {

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
