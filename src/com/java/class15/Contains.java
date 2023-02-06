package com.java.class15;

public class Contains {
    public static void main(String[] args) {
        String str = "Hello, Askar!\nThank you for interviewing for Apple." + "\nWe want to congratulate you on receiving an offer.";
        boolean doesContain = str.contains("Apple");
        System.out.println(doesContain);
        if (doesContain) {
            System.out.println(str);
        }
        boolean startsWith = str.startsWith("ello");
        if (startsWith) {
            System.out.println(str);
        }else {
            System.out.println("Don't bother");
        }boolean endsWith = str.endsWith("offer.");
        if (endsWith) {
            System.out.println(str);
        }else {
            System.out.println("Don't bother");
        }boolean str2=str.isEmpty();
        if (str2) {
            System.out.println(str);
        }else {
        System.out.println("Don't bother");
    }}
}