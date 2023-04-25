package com.java.class40;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAllKeys {
    public static void main(String[] args) {
        Map<String,Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Dana", 43);
        ageOfPeople.put("Azat", 34);
        ageOfPeople.put("Aidai", 34);
        ageOfPeople.put("Taira", 34);
        ageOfPeople.put("Madina", 34);

        Set<String> keys= ageOfPeople.keySet();
        for (String key:keys){
            System.out.println(key+ "="+ ageOfPeople.get(key));
        }

        Collection<Integer> values =ageOfPeople.values();
        for(int value:values){
            System.out.println(value);
        }
    }
}
