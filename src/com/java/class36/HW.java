package com.java.class36;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second integer");
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.err.println("Dividing by zero is undefined");
        }
        String name = null;
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.err.println("The length of a null string is invalid");
        }
        int[] nums = {1, 8, 6, 2, 7};
        try {
            System.out.println(nums[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Your index is out of bounds");
        }
    }
}
