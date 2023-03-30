package com.java.hashmap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args){
        Map<Integer, String> myMap = new java.util.HashMap<>();
        myMap.put(1, "Cat");
        myMap.put(2,"Dog");
        myMap.put(3,"Goose");
        System.out.println(myMap.get(3));
        System.out.println(myMap.containsValue("Bear"));
        System.out.println(myMap);

        //counting characters
        String myString = "Hello, my name is Vlad and I like apples";
        Map<String, Integer> letterCount = new java.util.HashMap<>();
        for(int i = 0; i < myString.length(); i++){
            String myLetter = myString.substring(i,i+1).toLowerCase();

            if(!letterCount.containsKey(myLetter)){
                letterCount.put(myLetter, 1);
            }else{
                letterCount.put(myLetter, letterCount.get(myLetter)+1);
            }
        }
        System.out.println(letterCount);
    }
}
