package com.java.class24;

import java.util.Scanner;

public class GetTwoArrayFromUser {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Please enter 3 numbers for row: " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < data.length; i++) {
            int max = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("Greatest number of row "+(i+1)+"=" +max);
        }
    }
}
