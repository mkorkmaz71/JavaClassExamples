package com.java.class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numbers[]={2,5,7,8};
        try {
            int num1= sc.nextInt(), num2= sc.nextInt();
            System.out.println(num1/num2);
            System.out.println(numbers[4]);
        }catch (InputMismatchException e){
            System.err.println("Enter numbers only");
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero");
        }catch (Exception e){
            System.err.println("Something went wrong");
        }
        System.out.println("Welcome to party");
        System.out.println("Enjoy your dinner");
    }
}
