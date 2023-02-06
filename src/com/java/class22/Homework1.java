package com.java.class22;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Write a program to find the greatest number from an array
//Example
//Input - 12, 45, 67, 23, 13, 45, 56
//Output - 67
        int listOfData[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 7 numbers: ");
        for(int i=0;i<listOfData.length;i++){
            listOfData[i]= sc.nextInt();
        }
        int biggestNumber=0;
        for (int i=0;i<listOfData.length;i++){
            if(listOfData[i]>=biggestNumber){
                biggestNumber=listOfData[i];
            }
        }System.out.println("The biggest number is: "+biggestNumber);
    }
}
