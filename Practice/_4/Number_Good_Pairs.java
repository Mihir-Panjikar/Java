package com.Practice._4;

import java.util.Arrays;

//1512. Number of Good Pairs
//        Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//        Example 1:
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//
//        Example 2:
//        Input: nums = [1,1,1,1]
//        Output: 6
//        Explanation: Each pair in the array are good.
//
//        Example 3:
//        Input: nums = [1,2,3]
//        Output: 0
public class Number_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(good_pairs(nums));
    }

    static int good_pairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j) {
                    pair++;
                }
            }
        }
        return pair;
    }

}
