package com.Problems;

import java.util.Scanner;

//character >= target and the smallest character possible
public class Ceiling_of_character_Leet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int len = in.nextInt();
        System.out.println("Enter array elements");
        char[] arr = new char[len];
        input(arr);
        System.out.print("Enter target: ");
        char result = Ceiling_character(arr, in.next().charAt(0));
        System.out.println();
        System.out.println(result);
    }

    static char Ceiling_character(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end =  mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        //if(target == arr[arr.length]) return arr[0];
        return arr[start % arr.length];
    }

    static void input(char[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next().charAt(0);
        }
    }

}
