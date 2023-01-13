package com.Beginner;

import java.util.Scanner;

public class Conditions_and_loops {
    public static void main(String[] args) {
        int salary = 25400;

        if (salary > 10000){
            salary += 2000;
        }

        else{
            salary += 1000;
        }

        System.out.println(salary);

        for (int num = 1;num <= 5 ;num += 1){
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
    }
}
