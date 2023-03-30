package com.java.class38;

import java.util.LinkedList;
import java.util.List;

public class ClassAssignment {
    public static void main(String[] args) {
        List<String> listOfFruits = new LinkedList<>();

        listOfFruits.add("Banana");
        listOfFruits.add("Mango");
        listOfFruits.add("Apple");
        listOfFruits.add("Orange");

        if(listOfFruits.contains("Banana")) {
            listOfFruits.remove("Mango");
        }
        System.out.println(listOfFruits);
    }
}
