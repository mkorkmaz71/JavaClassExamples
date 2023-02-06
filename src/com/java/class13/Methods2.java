package com.java.class13;

import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Please enter the first integer:");
        a = sc.nextInt();
        System.out.println("Please enter the first integer:");
        b = sc.nextInt();
        System.out.println(inTheRange(a, b));
    }

    public static boolean inTheRange(int a, int b) {
        //if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
        //    return true;
        //}
        //return false;
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
