package com.Practice._2;

import java.util.Scanner;

// Reverse A String In Java
public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = in.nextLine();
        String reverse = "";

        for(int i = string.length()-1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        System.out.println("Reverse of "+ string +" is " + reverse);
    }
}
