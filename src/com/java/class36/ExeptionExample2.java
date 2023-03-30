package com.java.class36;

public class ExeptionExample2 {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Something went wrong");
        }
    }
}
