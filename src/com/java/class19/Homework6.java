package com.java.class19;

public class Homework6 {
    public static void main(String[] args) {
        //Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2 (edited)
        int i;
        int sum = 0;
        for (i = 1; i <= 5; i++) {
            sum = sum + (int) Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
