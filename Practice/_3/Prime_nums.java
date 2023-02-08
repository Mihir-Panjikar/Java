package com.Practice._3;

public class Prime_nums {
    public static void main(String[] args) {
        prime(2, 100);
    }

    static void prime(int min, int max) {

        for (int i = min; i < max; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                }
            }

            if(flag) System.out.print(i + ", ");
        }
    }
}
