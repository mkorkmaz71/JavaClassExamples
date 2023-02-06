package com.java.class14;

public class StringSubstring {
    public static void main(String[] args) {
        String str="Hello World DevX";
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,9));
        System.out.println(str.indexOf("Wor"));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("o"));//first occurrence
        System.out.println(str.indexOf("!"));//no matching returns -1
        System.out.println(str.indexOf("o",5));
        System.out.println(str.indexOf("ello",5));

    }
}
