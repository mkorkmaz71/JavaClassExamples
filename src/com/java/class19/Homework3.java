package com.java.class19;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // Write a program to find a magic number from 1 to 100,
        // if you divide that number by 5 you will get remainder 4
        // if you divide that number by 4 you will get remainder 3
        // if you divide that number by 3 you will get remainder 2
        // if you divide that number by 2 you will get remainder 1
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 4) {
                if (i % 4 == 3) {
                    if (i % 3 == 2) {
                        if (i % 2 == 1) {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}
