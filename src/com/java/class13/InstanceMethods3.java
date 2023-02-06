package com.java.class13;

import java.util.Scanner;

public class InstanceMethods3 {
    public static void main(String[] args) {
        System.out.println("Please enter a non-negative integer");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();
        InstanceMethods3 var = new InstanceMethods3();
        System.out.println(var.Multiple3n5(a));
    }

    public boolean Multiple3n5(int a) {
        if(a<0){
            System.out.println("Entered negative integer");
    } else if(a%5==0 && a%3==0){
        return true;
    }
    return false;

}

}
