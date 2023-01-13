package com.Practice._2;

import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double rad = in.nextDouble();
        double perimeter = 2 * 3.14 * rad;

        System.out.println("Perimeter: " + perimeter);
    }
}
