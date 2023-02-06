package com.java.class16;

public class Homework1 {
    public static void main(String[] args) {
//Write a program that uses a while loop to print the odd numbers from 1 to 20. => 1,3,5,7,9,11,13,15,17,19
        int a = 1;
        System.out.println("The odd numbers from 1 to 20 ");
        while (a <= 20) {
            System.out.print(a+"   ");
            a+=2;
        }
    }
}