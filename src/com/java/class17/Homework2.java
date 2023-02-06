package com.java.class17;

import java.util.Scanner;

class Homework2 {
    public static void main(String[] args) {

        int j = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int num = scanner.nextInt();
        System.out.print("Prime numbers between 1 to " + num + " are ");
        while (j <= num) {
            int i = 1;
            int counter = 0;
            while (i <= j) {
                if (j % i == 0) {
                    counter++;
                }
                ++i;
            }
            if (counter == 2) {
                System.out.print(j + " ");
            }
            ++j;
        }
    }
}