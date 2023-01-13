package com.Problems;

import java.util.Arrays;
import java.util.Scanner;

//Number >= target and the smallest number possible
//code almost similar to floor number code
public class Ceiling_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int len = in.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[len];
        input(arr);
        System.out.print("Enter target: ");
        int[] result = Ceiling_Binary(arr, in.nextInt());
        System.out.println();
        if(result[0] == -1) System.out.println("Ceiling not possible");
        else System.out.println(Arrays.toString(result));
    }

    static int[] Ceiling_Binary(int[] arr, int target) {
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

//        if (arr[end] == target) return new int[] {arr[end],end};
//
//        else if(end+1 == arr.length){
//            return new int[] {-1,-1};
//        }
//
//        else return new int[] {arr[end+1],end+1};

        if(start == arr.length){
            return new int[] {-1,-1};
        }

        else return new int[] {arr[start],start};
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
