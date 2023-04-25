package com.java.class39;

import java.util.HashSet;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        String str = "well, collection is very easiest topic in java and it is very useful as well";
        String nstr = str.replace(",", "");
        String[] words = nstr.split(" ");
        Set<String> allWords= new HashSet<>();
        Set<String> duplicateWords= new HashSet<>();
        for (int i=0; i< words.length;i++){
            if(allWords.add(words[i])==true){
                allWords.add(words[i]);
            }else{
                duplicateWords.add(words[i]);
            }
        }
        System.out.print("All words are:"+allWords);
        System.out.println();
        System.out.print("Duplicate words are:"+duplicateWords);
        allWords.removeAll(duplicateWords);
        System.out.println();
        System.out.print("Unique words are:"+allWords);
    }
}
