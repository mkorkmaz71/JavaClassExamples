package com.java.class38;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int [] salary= new int[5];//fixed length
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your salary");
        for (int i=0;i<salary.length;i++){
            salary[i]= sc.nextInt();
        }
    }
}
