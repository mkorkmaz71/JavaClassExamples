package com.java.class37;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
            int age= sc.nextInt();
            if (age<0||age>=100) {
                throw new ArithmeticException("Invalid age specified");
            } else if (age>=13&&age<=19){
                System.out.println("Teenager");
            }else {
                System.out.println("Not teenager");
            }
        System.out.println("Please enter your weight");
        int weight= sc.nextInt();
        if (weight*age>=100){
            System.out.println("You are fit");
        }else {
            System.out.println("You are not fit");
        }
    }
}
