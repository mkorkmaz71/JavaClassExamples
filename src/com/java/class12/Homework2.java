package com.java.class12;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade = input.next().charAt(0);
        boolean result = gradePasses(grade);
        if (result) {
            System.out.println("Your grade is passing");
        } else {
            System.out.println("Your grade is falling");
        }
    }

    public static boolean gradePasses(char grade) {
        if (grade == 'A' || grade == 'B') {
            return true;
        } else if (grade == 'C' || grade == 'D' || grade == 'F') {
            return false;
        } else {
            System.out.println("Wrong Input!");
        }
        return false;
    }
}