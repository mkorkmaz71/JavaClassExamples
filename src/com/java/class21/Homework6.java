package com.java.class21;

public class Homework6 {
    public static void main(String[] args) {
//Write a program to print the below pattern
// *********
//  *******
//   *****
//    ***
//     *

        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 11 - i * 2; j++) {
                System.out.print("*");
            }
            //for (int t = 1; t < i; t++) {
            //    System.out.print("*");
            //}
            //for (int s = 1; s <= 5 - i; s++) {
            //    System.out.print(" ");
            //}
            System.out.println();
        }
    }
}
