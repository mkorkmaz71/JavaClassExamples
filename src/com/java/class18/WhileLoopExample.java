package com.java.class18;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            if (i%3==0){
               i--;
           }else if(i%2==0){
               i=i+2;
           }else {
               i++;
           }
            i+=2;

        }
    }
}
