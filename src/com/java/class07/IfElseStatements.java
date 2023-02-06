package com.java.class07;

public class IfElseStatements {
    public static void main(String[] args) {
        //if statement is alogical flow control
        //you can write a program gthat executes certain portion of the code
        //only in certain conditions



        if (true){
            System.out.println("HelloWorld");//true prints false doesn't print
            System.out.println("HelloJupiter");//true prints false doesn't print
        }
        //proceed with normal execution
        System.out.println("I'm outside of if Statement");

        if (false)
            System.out.println("HelloMars");//without braces first considered as in
            System.out.println("HelloSaturn");//without braces second considered as out

        int gallonofoil=1200;

        if (gallonofoil>1000){
            System.out.println("HelloVenus");
        }
    }
}
