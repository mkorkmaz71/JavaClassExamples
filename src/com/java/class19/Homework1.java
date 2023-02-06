package com.java.class19;

public class Homework1 {
    public static void main(String[] args) {
        // Write a program to print the sum of even numbers from 1 to 10
        int i;
        int sum = 0;
        for (i = 1; i <= 10;i++){
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
