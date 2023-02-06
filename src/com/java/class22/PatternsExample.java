package com.java.class22;

import java.util.Scanner;

public class PatternsExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }System.out.println();
        }

        for (int i = num-1; i >= 1; i--) {
            for (int s = 1; s <= num-i ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}