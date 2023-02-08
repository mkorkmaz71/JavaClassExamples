package com.java.class22;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//Write a program to find the sum of even and odd numbers
//Example
//Input - 12, 45, 67, 23, 13, 45, 56
//Output - Sum of Even Elements - 68, Sum of Odd Elements - 193
        int listOfData[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 7 numbers: ");
        for(int i=0;i<listOfData.length;i++){
            listOfData[i]= sc.nextInt();
        }
        int sumOfEvens=0;
        int sumOfOdds=0;
        for (int i=0;i<listOfData.length;i++){
            if(listOfData[i]%2==0){
                sumOfEvens=sumOfEvens+listOfData[i];
            } else {
                sumOfOdds=sumOfOdds+listOfData[i];
            }
        }System.out.println("Sum of Even Elements is: "+sumOfEvens);
        System.out.println("Sum of Odd Elements is: "+sumOfOdds);
    }
}
