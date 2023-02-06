package com.java.class08;

import java.util.Scanner;

public class IfElseStatement2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first one's salary $");
        int salary1 = input.nextInt();
        System.out.println("Please enter second one's salary $");
        int salary2 = input.nextInt();
        if (salary1 > salary2) {
            System.out.println(salary1);
        } else {
            System.out.println(salary2);
        }

    }
}
