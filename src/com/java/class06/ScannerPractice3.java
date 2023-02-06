package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username and hit enter");
        String username=input.nextLine();
        System.out.println("Please enter your password and hit enter");
        String password=input.nextLine();

        boolean login;
        login= username.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");
        System.out.println(login);


    }
}
