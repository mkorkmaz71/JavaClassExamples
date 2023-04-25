package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HW_Map {
    public static void main(String[] args) {
        Map<String ,String> captainOfTeam = new HashMap<>();

        captainOfTeam.put("Argentina","Lionel Messi");
        captainOfTeam.put("Belgium","Eden Hazard");
        captainOfTeam.put("Brazil","Thiago Silva");
        captainOfTeam.put("Denmark","Simon Kjaer");
        captainOfTeam.put("Portugal","Cristiano Ronaldo");
        captainOfTeam.put("USA","Christian Pulisic");
        captainOfTeam.put("Australia","Mathew Ryan");
        captainOfTeam.put("Wales","Gareth Bale");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a football player\'s name as a captain");
        String name= sc.nextLine();

        Set<Map.Entry<String, String>> pairs = captainOfTeam.entrySet();
        String country=null;
        for (Map.Entry<String, String> pair : pairs) {
            if (name.equalsIgnoreCase(pair.getValue())){
                country = pair.getKey();
            }
        }
        System.out.println( name+" is the captain of "+ country);
    }
}
