package com.java.class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String,Integer> marksOfStudent = new HashMap<>();
        marksOfStudent.put("Dana", 98);
        marksOfStudent.put("Azat", 75);
        marksOfStudent.put("Aidai", 69);
        marksOfStudent.put("Taira", 100);
        marksOfStudent.put("Madina", 70);

        System.out.println(marksOfStudent);
        System.out.println(marksOfStudent.get("Madina"));
        System.out.println(marksOfStudent.size());
        System.out.println(marksOfStudent.isEmpty());
        System.out.println(marksOfStudent.containsKey("Dana"));
        System.out.println(marksOfStudent.containsValue(100));
    }
}
