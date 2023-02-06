package com.java.class03;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(20/10);

        //Modulo
        System.out.println(14%10);
        System.out.println(13%5);
        System.out.println(42%3);
        // When we modulo with 2 the answer depends on even or odd
        System.out.println(31%2); // 1
        System.out.println(12%2); // 0
        System.out.println(47%2); // 1
        System.out.println(8%2);  // 0
        // When we modulo with 10 the answer the last digit of number
        System.out.println(31%10); // 1
        System.out.println(12%10); // 2
        System.out.println(47%10); // 7
        System.out.println(8%10);  // 8

        System.out.println(31/10); // 3
        System.out.println(12/10); // 1
        System.out.println(47/10); // 4
        System.out.println(8/10);  // 0

        System.out.println(127/10); // 12
        System.out.println(472/10);  // 47
    }
}
