package com.java.class39;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        String str = "This is my collection program";
        str=str.toLowerCase();
        Map<Character, Integer> frequencyOfCharacters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char character=str.charAt(i);
            if(frequencyOfCharacters.containsKey(character)){
                frequencyOfCharacters.put(character, frequencyOfCharacters.get(character)+1);
            }else{
                frequencyOfCharacters.put(character,1);
            }
        }
        System.out.println("Frequency of characters are" + frequencyOfCharacters);

    }
}
