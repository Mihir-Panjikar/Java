package com.Practice._1;

import java.util.Scanner;

public class rs_to_usd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        double rupees = in.nextDouble();
        double usd = rupees * 0.012;
        System.out.println("USD: $" + usd);
    }
}
