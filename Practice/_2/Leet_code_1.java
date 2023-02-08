package com.Practice._2;

import java.util.Scanner;

/*
eg: 1281. Subtract the Product and Sum of Digits of an Integer

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */
public class Leet_code_1 {
    public static void main(String[] args) {
        System.out.print("Enter a number of more than 1 digit: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int product = 1;
        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }

        int result = product - sum;
        System.out.println("Result: " + result);
    }
}
