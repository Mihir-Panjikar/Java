package com.Practice._2;

import java.util.Scanner;
// Check Leap Year Or Not
public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = in.nextInt();

        if (year % 4 == 0) System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
    }
}
