package com.Recursion.Basics;

public class _3_NumbersExample_Recursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers using recursion: 1 2 3 4 5
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // Recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function
        print(n + 1);
    }
}
