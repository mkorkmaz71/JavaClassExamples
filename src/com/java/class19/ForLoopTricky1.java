package com.java.class19;

import java.util.Scanner;

public class ForLoopTricky1 {
    public static void main(String[] args) {
/*      int i;
        for (i=1; i<=10; i++){

        }
        System.out.println(i);
---------------------------------------------------
        int i;
        for ( i=1; i<=10; i++){
        i=i+2;

        }System.out.println(i);
---------------------------------------------------
        int i;
        int sum=0;
        for (i=6; i<=9; i++){
        sum=sum+i;
        }
        System.out.println(sum);
---------------------------------------------------
        int i;
        int mul=1;
        for (i=1; i<=5; i++){
            mul=mul*i;
        }
        System.out.println(mul);
----------------------------------------------------
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int mul=1;
        for (int i=1; i<=num; i++){
            mul=mul*i;
        }
        System.out.println(mul);
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        for (int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }

        }

    }
}
