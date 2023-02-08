package com.java.class23;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Write a program to get a collection of elements and print it in reverse order
//Input: 1 2 3 4 5
//Output: 5 4 3 2 1
        int listOfData[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = sc.nextInt();
        }
        int revListOfData[] = new int[5];
        for (int i = 0; i < listOfData.length; i++) {
            revListOfData[listOfData.length - 1 - i] = listOfData[i];
        }
        for (int i = 0; i < revListOfData.length; i++) {
            System.out.print(revListOfData[i] + " ");
        }
    }
}