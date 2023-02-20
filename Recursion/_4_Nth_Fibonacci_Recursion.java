package com.Recursion;

public class _4_Nth_Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n) {
        // Base condition
        if (n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
