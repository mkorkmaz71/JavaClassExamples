package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW_3 {
    public static void main(String[] args) {
        String str = "well, collection is very easiest topic in java and it is very useful as well";
        System.out.println(str);
        String nstr = str.replace(", ", " ");
        String[] words = nstr.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[i].equals(words[j])) {
                    c++;
                }
            }
            if (c == 0) {
                uniqueWords.add(words[i]);
            }
            c = 0;
        }System.out.println("Unique words are:");
        for (String string : uniqueWords) {
            System.out.print(string + " ");
        }
    }
}

