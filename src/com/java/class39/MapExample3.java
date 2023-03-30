package com.java.class39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        List<String> ingredients= new ArrayList<>();
        Map<String,List<String> >foodItems = new HashMap<>();

        ingredients.add("Raw rice");
        ingredients.add("Water");
        ingredients.add("Air");
        foodItems.put("Boiled Rice",ingredients);
        ingredients.clear();

        ingredients.add("Vegetables");
        ingredients.add("salt");
        ingredients.add("oil");
        ingredients.add("water");
        ingredients.add("spices");
        foodItems.put("Vegetable Curry",ingredients);
        ingredients.clear();

        ingredients.add("salt");
        ingredients.add("water");
        ingredients.add("spices");
        ingredients.add("Pulses");
        foodItems.put("Pulses",ingredients);
        ingredients.clear();

        System.out.println(foodItems);
        System.out.println(foodItems.get("Dal"));
        System.out.println(foodItems.size());
        System.out.println(foodItems.isEmpty());
        System.out.println(foodItems.containsKey("Vegetable Curry"));
    }
}
