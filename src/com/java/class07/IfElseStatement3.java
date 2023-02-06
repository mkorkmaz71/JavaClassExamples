package com.java.class07;

import java.util.Scanner;

public class IfElseStatement3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weather temperature in Fahrenheit");
        int temperature = input.nextInt();
        if (temperature < 32) {
            System.out.println("It's freezing, Stay Home");
        }
        if (temperature >= 32 && temperature < 42) {
            System.out.println("It is chilly outside");
        }
        if (temperature >= 42 && temperature < 68) {
            System.out.println("It is a good weather outside, go get some fresh air");
        }
        if (temperature >= 68) {
            System.out.println("It is amazing outside, let's go to pool and get vitamin D");
        }
    }
}