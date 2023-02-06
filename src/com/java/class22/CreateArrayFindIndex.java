package com.java.class22;

import java.util.Scanner;

public class CreateArrayFindIndex {
    public static void main(String[] args) {
        int listOfData[]=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 8 numbers: ");
        for(int i=0;i<listOfData.length;i++){
            listOfData[i]= sc.nextInt();
        }
        System.out.println("Please enter target number we need to find: ");
        int targetNumber= sc.nextInt();
        for (int i=0;i<listOfData.length;i++){
            if(listOfData[i]==targetNumber){
                System.out.println("Index is: "+i);
            }
        }
    }
}
