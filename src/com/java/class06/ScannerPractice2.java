package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
      //  System.out.println("Please enter your age and hit enter");
     //   int age=input.nextInt();
     //   System.out.println(age);

     //   System.out.println("Please enter your credit score between 0-820 and hit enter");
     //   int creditscore=input.nextInt();
     //   System.out.println(creditscore);


        Scanner input1 = new Scanner(System.in);
        System.out.println("Please tell us are you married? Write true for married, false for single and hit enter");
        boolean maritalstatus=input1.nextBoolean();
        System.out.println(maritalstatus);

    }
}
