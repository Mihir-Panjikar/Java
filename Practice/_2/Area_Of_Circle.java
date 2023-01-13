package com.Practice._2;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double rad = in.nextDouble();
        double area = 3.14 * rad * rad;

        System.out.println("Area: " + area);
    }
}
