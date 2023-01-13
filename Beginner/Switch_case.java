package com.Beginner;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

        int day = in.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println("Monday");
                System.out.println("Really it's a Monday?");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect day");
        }

        //use of switch case without the break statements in certain cases

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }

    }
}
