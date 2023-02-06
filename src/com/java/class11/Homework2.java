package com.java.class11;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one of the operators (+,-,/,*)");
        String operator = input.next();
        System.out.println("Please enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Please enter the second number");
        double num2 = input.nextDouble();
        switch (operator) {
            case "+":
                System.out.println("The result is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The result is " + (num1 - num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed!");
                } else {
                    System.out.println("The result is " + num1 / num2);
                }
                break;
            case "*":
                System.out.println("The result is " + (num1 * num2));
                break;
            default:
                System.out.println("You entered wrong operator!");
        }
    }
}
