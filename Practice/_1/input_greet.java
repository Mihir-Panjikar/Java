package com.Practice._1;

import java.util.Scanner;

public class input_greet {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hola " + name + ",como estas?");
    }
}
