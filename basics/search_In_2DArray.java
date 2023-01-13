package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class search_In_2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter dimensions of the array");
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter elements");
        input(arr);

        System.out.print("Enter element to be searched: ");
        int target = in.nextInt();

        boolean boolresult = boolSearch2D(arr, target);
        int[] intresult = locSearch2D(arr, target);

        System.out.println();
        print(arr);

        if (boolresult){
            System.out.println("Element is present");
            System.out.println("Location is row " + intresult[0]+1 + " and column " + intresult[1]+1);
        }
        else System.out.println("Element is not present");
    }

    static boolean boolSearch2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return true;
            }
        }
        return false;
    }

    static int[] locSearch2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return new int[] {row,col};
            }
        }
        return new int[]{-1, -1};
    }

    static void input(int[][] arr) {
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    }

    static void print(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}