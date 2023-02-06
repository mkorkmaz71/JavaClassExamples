package com.java.class20;

public class Homework2 {
    public static void main(String[] args) {
//Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
//Note - Please print the sum in decimal, answer should not be zero
        double sum=0;
        for (double i = 1.0; i <= 10; i++) {
            sum=sum+i/(i+1);
        }
        System.out.println(sum);

    }
}
