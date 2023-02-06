package com.java.class16;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Write a program that uses a while loop to print the multiplication table for a given number.
 /*       Enter number to print table: 7
        7 * 1 = 7
        7 * 2 = 14
        7 * 3 = 21
        7 * 4 = 28
        7 * 5 = 35
        7 * 6 = 42
        7 * 7 = 49
        7 * 8 = 56
        7 * 9 = 63
        7 * 10 = 70
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to print table: ");
        int entry= sc.nextInt();
        int num=0;
        while (num<10){
            num++;
            System.out.println(entry+"*"+num+"="+entry*num);
        }
    }
}