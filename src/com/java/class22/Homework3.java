package com.java.class22;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Write a program to count number of positive(consider zero also positive) and negative numbers from an array
//Example
//Input - 12, -45, 67, 23, -13, 45, -56
//Output - Positive Elements - 4, Negative Elements - 3
        int listOfData[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 7 numbers: ");
        for(int i=0;i<listOfData.length;i++){
            listOfData[i]= sc.nextInt();
        }
        int positive=0;
        int negative=0;
        for (int i=0;i<listOfData.length;i++){
            if(listOfData[i]<0){
                negative++;
            } else if(listOfData[i]>0){
                positive++;
            }
        }System.out.println("Number of Positive Elements is: "+positive);
        System.out.println("Number of Negative Elements is: "+negative);
    }
}
