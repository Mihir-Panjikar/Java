package com.Practice._3;

public class Sum_n_narural_nums {
    public static void main(String[] args) {
        System.out.println(sum_natural(2));
    }

    static int sum_natural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
