package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Integer> salary = new HashMap<>();
        salary.put("Dana", 2400);
        salary.put("Chirag", 2000);
        salary.put("Azat", 6000);
        salary.put("Emily", 1500);
        salary.put("Chirag", 7200);
        salary.put("Aizhan", 6700);
        salary.put("Madina", 7400);
        salary.put("Milana", 1800);
        Set<Map.Entry<String, Integer>> salaryPairs = salary.entrySet();
        Integer maxSalary = Integer.MIN_VALUE;
        String max = null;
        for (Map.Entry<String, Integer> ms : salary.entrySet()) {
            if (ms.getValue() > maxSalary) {
                maxSalary = ms.getValue();
                max = ms.getKey();
            }
        }
        System.out.println(max + " getting the maximum salary as $" + maxSalary);
        Integer totalSalary = 0;
        for (Map.Entry<String, Integer> ms : salary.entrySet()) {
            if (ms.getValue() > 0) {
                totalSalary = totalSalary + ms.getValue();
            }
        }
        System.out.println("Total Salary is $" + totalSalary);
        totalSalary = 0;
        int count=0;
        for (Map.Entry<String, Integer> ms : salary.entrySet()) {
                totalSalary = totalSalary + ms.getValue();
                count++;
        }
        int averageSalary=totalSalary/count;
        System.out.println("Average Salary= $"+averageSalary);
        for (Map.Entry<String, Integer> ms : salary.entrySet()) {
            if (ms.getValue() >=averageSalary) {
                System.out.println(ms.getKey()+" is getting more than average $" + ms.getValue());
            }
        }
        System.out.println("New salaries are with 20% increase ");
        for (Map.Entry<String, Integer> ms : salary.entrySet()) {
                ms.setValue(ms.getValue()+ms.getValue()*20/100);
                System.out.println(ms.getKey()+" = "+ms.getValue());
        }
    }


}
