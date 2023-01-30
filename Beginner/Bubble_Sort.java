package com.Beginner;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble_sort(int[] arr) {
        boolean swapped;
        //run the steps (n - 1) times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i. it means the array is sorted hence stop the program
            if(!swapped) {
                break;
            }
        }
    }
}
