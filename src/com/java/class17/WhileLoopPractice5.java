package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//palindromic number
        System.out.println("Please enter your string:");
        String isPalindromic = input.nextLine();
        int length = isPalindromic.length();
        int i = 0;
        while (i <= length/2) {

            if (isPalindromic.charAt(i) == isPalindromic.charAt(length - 1)) {
                length--;
                i++;}}
                if (i == length / 2) {

                    System.out.print(isPalindromic + " is palindromic.");

            } else {
                System.out.print(isPalindromic + " is not palindromic.");
            }
}

}

