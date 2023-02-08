package com.java.class24;

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, -6, 78, 32};
        int min = Integer.MAX_VALUE;
        for (int temp : data) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Smallest number of row =" + min);
    }
}