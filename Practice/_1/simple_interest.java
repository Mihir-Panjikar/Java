package com.Practice._1;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal, time and rate");
        int principal = in.nextInt();
        int time = in.nextInt();
        int rate = in.nextInt();
        int interest = principal * time * rate;
        System.out.println("Interest: " + interest);
    }
}
