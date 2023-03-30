package com.java.class38;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
        String str = "We are almost finishing java";
        Set<Character> newStr = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (newStr.contains(str.charAt(i))) {
                duplicates.add(str.charAt(i));
            } else {
                newStr.add(str.charAt(i));
            }}
            for (Character e : duplicates) {
                System.out.print( e );
            }
    }
}