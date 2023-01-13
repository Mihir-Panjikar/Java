package com.Beginner;

import java.util.ArrayList;
import java.util.Scanner;
public class Arr_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
