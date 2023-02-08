package com.Practice._3;

import java.util.Scanner;

public class Vote_eligible {
    public static void main(String[] args) {
        vote();
    }

    static void vote() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        if(age > 0 && age < 18) System.out.println("NOT ELIGIBLE TO VOTE");
        else if(age >= 18) System.out.println("ELIGIBLE TO VOTE");
        else System.out.println("INVALID AGE");
    }
}
