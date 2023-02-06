package com.java.class20;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//Write a program to print the reverse of the given number
//Example1
//Input - 86545
//Output - 54568
//Example2
//Input - 23561
//Output - 16532
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 0, newNum=0;
        while (num>0) {
            i=num%10;
            newNum=newNum*10+i;
            num=num/10;
        }System.out.print(newNum);
    }
}
