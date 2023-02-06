package com.java.class17;

public class Homework1 {
    public static void main(String[] args) {
//Write a program that calculates the sum of all even numbers
// between 1 and a 100 using a while loop.
//2+4+6+8 … = ?
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
            num++;
        }
        System.out.println("The sum of all even numbers between 1 and a 100 is " + sum);
    }
}
