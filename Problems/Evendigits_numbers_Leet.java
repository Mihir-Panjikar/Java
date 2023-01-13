package com.Problems;

import java.util.Scanner;

public class Evendigits_numbers_Leet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = in.nextInt();
        System.out.println("Enter elements of the array");
        int[] arr = new int[len];
        input(arr);
        int even_digi_nums = findNumbers(arr);
        System.out.println("Numbers that have even digits are " + even_digi_nums);
    }

    static int findNumbers(int[] Nums) {
        int count = 0;
        for (int num : Nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int count) {
        return digits(count) % 2 == 0;
    }

    static int digits(int Nums){
        if(Nums < 0) {
            Nums *= -1;
        }

        if(Nums == 0) {
            return 1;
        }

        int count = 0;
        while(Nums > 0) {
            Nums /= 10;
            count++;
        }
        return count;
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

//    static int findNumbers(int[] Nums) {
//        int evennums = 0;
//        for (int i = 0; i < Nums.length; i++) {
//            if(Nums[i] < 0) {
//                Nums[i] *= -1;
//            }
//
//            if(Nums[i] == 0) {
//                count = 1;
//            }
//
//            int count = 0;
//            while(Nums[i] > 0) {
//                Nums[i] /= 10;
//                count++;
//            }
//            if(count % 2 ==0) evennums++;
//        }
//        return evennums;
//    }

//    Method to get digits from a number
//    Math.log10(number) + 1

}
