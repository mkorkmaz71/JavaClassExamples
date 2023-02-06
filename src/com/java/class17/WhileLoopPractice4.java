package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please write your string:");
        String str=input.nextLine();
        int length = str.length();
        int index=0;
        while(index<length) {
            System.out.print(str.charAt(index));
            index+=2;
        }
    }
}
