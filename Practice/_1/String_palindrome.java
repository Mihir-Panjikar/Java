package com.Practice._1;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int j = string.length()-1;

        for (int i = 0; i <= (string.length()-1)/2; i++) {
            if(string.charAt(i) != string.charAt(j)) {
                System.out.println(string + " is not palindrome");
                return;
            }
            j--;
        }

        System.out.println(string + " is palindrome");
    }
}
