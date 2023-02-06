package com.java.class14;

import java.util.Scanner;

public class CharAtPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("The last character of your string is "+ theLastCharacter(str));
    }
    public static char theLastCharacter(String str){
        return str.charAt(str.length()-1);

    }
}
