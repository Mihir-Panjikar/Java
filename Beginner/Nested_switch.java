package com.Beginner;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Jacob ferns");
            case 2 -> System.out.println("Rakesh rathore");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
