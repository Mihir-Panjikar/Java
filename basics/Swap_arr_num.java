package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_arr_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Arr = new int[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            Arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(Arr));

        System.out.println("Enter swap indexes");
        swap(Arr,in.nextInt(), in.nextInt());

        System.out.println(Arrays.toString(Arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
