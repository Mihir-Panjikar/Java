package com.Beginner;

import java.util.Arrays;


//This sorting method can only be used when the numbers are continuous that every number should be present from 1 to n
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        Cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
    }

//    static void Cyclic_sort(int[] arr) {
//        int i = 0;
//        while(i < arr.length){
//            if (i == arr[i] - 1){
//                i++;
//                continue;
//            }
//            swap(arr, i, arr[i]-1);
//        }
//    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
