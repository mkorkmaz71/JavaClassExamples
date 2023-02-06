package com.java.class15;

public class Replace {
    public static void main(String[] args) {
        String str = "DevX Adventures World";
        int indexOfFirstSpace = str.indexOf(" ");
        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e", "X");
        String DevXOnly = str.substring(0, indexOfFirstSpace);
        String finalResult = DevXOnly.concat(noDevXEReplaced);
        System.out.println(finalResult);
    }
}
