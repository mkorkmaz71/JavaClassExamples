package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewAssignment {
    public static void main(String[] args) {

        String str = "thisismyfirstjavacollectionclassanditiseasy";
        str = str.toLowerCase();
        Map<Character, Integer> frequencyOfCharacters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (frequencyOfCharacters.containsKey(character)) {
                frequencyOfCharacters.put(character, frequencyOfCharacters.get(character) + 1);
            } else {
                frequencyOfCharacters.put(character, 1);
            }
        }
        System.out.println("Frequency of characters are" + frequencyOfCharacters);

        Set<Entry<Character, Integer>> pairs = frequencyOfCharacters.entrySet();

        int max = Integer.MIN_VALUE;
        char maxChar = 0;
        for (Entry<Character, Integer> pair : pairs) {
            if (max <= pair.getValue()) {
                max = pair.getValue();
                maxChar = pair.getKey();
            }
        }
        System.out.println("Greatest frequency char is \"" + maxChar + "\" frequency is " + max);
    }
}
