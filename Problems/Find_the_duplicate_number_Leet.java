package com.Problems;

// Find the duplicate number from 1 to n
// Amazon Question
// Using Cyclic sort

public class Find_the_duplicate_number_Leet {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(Cyclic_sort(arr));
    }

    static int Cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }

        // Search for duplicate number
        int ans = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                ans = arr[index];
                break;
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
