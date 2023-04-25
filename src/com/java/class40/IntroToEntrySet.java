package com.java.class40;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IntroToEntrySet {
    public static void main(String[] args) {
        Map<String,Integer> salary= new HashMap<>();

        salary.put("Ali", 115);
        salary.put("Madina", 100);
        salary.put("Kateryna", 200);
        salary.put("Azat", 175);
        salary.put("Dana", 102);

        Set<Map.Entry<String,Integer>> pairs=salary.entrySet();

        for(Entry<String,Integer> pair  : pairs){
            System.out.println(pair.getKey()+ "    =    "+pair.getValue());

        }
    }
}
