package com.java.class16;

public class Homework2 {
    public static void main(String[] args) {
//Write a program that uses a while loop to print the sum of the numbers from 1 to 10. => 1+2+3+4+5+6+7+8+9+10. result should be 55?
        int a = 1;
        int b = 0;
        while (a <= 10) {
            b = a + b;
            a++;
        }
        System.out.println("The sum of the numbers from 1 to 10 " + b);
    }
}
