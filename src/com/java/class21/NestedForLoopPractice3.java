package com.java.class21;

public class NestedForLoopPractice3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <=5-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int t =1; t <i; t++) {
                System.out.print(Math.abs(t-i));
            }
            for (int s = 1; s <=5-i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
