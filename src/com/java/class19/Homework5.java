package com.java.class19;

public class Homework5 {
    public static void main(String[] args) {
        //  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
        int i, j;
        int sum = 0;
        for (i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        for (j = 10; j >= 6; j--) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
