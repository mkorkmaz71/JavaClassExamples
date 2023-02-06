package com.java.class20;

public class Homework1 {
    public static void main(String[] args) {
//Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
        double sum=0;
        for (double i = 1; i <= 5; i++) {
            sum=sum+Math.pow(i,i);
        }
        System.out.println(sum);
    }
}
