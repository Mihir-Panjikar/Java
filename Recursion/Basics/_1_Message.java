package com.Recursion.Basics;

//A very basic program to start understanding the concept of programming
public class _1_Message {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello World");
        message1();
    }

    static void message1() {
        System.out.println("Hello World");
        message2();
    }

    static void message2(){
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
    }
}
