package com.Problems;

// Find the missing number from 0 to n
// Amazon Question
// Using Cyclic sort
public class Missing_number_Leet {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(Cyclic_sort(arr));
    }

    static int Cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }

        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
