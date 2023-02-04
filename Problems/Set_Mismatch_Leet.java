package com.Problems;

import java.util.Arrays;

public class Set_Mismatch_Leet {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(Cyclic_sort(arr)));
    }

    static int[] Cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }

        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
