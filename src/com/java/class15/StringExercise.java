package com.java.class15;

public class StringExercise {
    public static void main(String[] args) {
        String str="I love waking at 5am";
        int var=str.indexOf("5am");
        int lenght="5am".length();
        System.out.println(str.substring(var,var+lenght));
    }
}
