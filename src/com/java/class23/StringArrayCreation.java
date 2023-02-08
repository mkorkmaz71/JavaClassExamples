package com.java.class23;

import java.util.Scanner;

public class StringArrayCreation {
    public static void main(String[] args) {
        String names[]=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 5 names ");
        for(int i=0;i<names.length;i++){
            names [i]= sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(names[i]+"="+names[i].length());
        }
    }
}
