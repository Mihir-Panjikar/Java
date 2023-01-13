package com.Practice._4;

import java.util.Arrays;
import java.util.Scanner;

// 1920. Build Array from Permutation
//        Given a zero-based permutation nums (0-indexed),
//        build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
//
//        Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//        = [0,1,2,4,5,3]
public class Build_Array_from_Permutation {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a size: ");
//        int len = in.nextInt();
//        int[] arr = new int[len];
//
//        System.out.println("Enter " + len + " number between 0 to " + len);
//        for (int i = 0; i < len; i++) {
//            arr[i] = in.nextInt();
//        }

        int[] arr = {5,0,1,2,3,4};

        permutate(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void permutate(int[] arr) {
        int[] temp = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[arr[i]];
        }
    }

}
