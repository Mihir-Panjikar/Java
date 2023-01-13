package com.basics;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = in.nextLine();
        System.out.print("Enter target: ");
        char target = in.next().charAt(0);

        boolean result = search(name, target);

        if (result) System.out.println("Character is present");
        else System.out.println("Character is not present");
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

//        for (char ch: str.toCharArray()) {
//            if (ch == target) {
//                return true;
//            }
//        }

        return false;
    }
}
