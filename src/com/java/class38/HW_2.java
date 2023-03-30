package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        List<Integer> listOfNums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five integers");
        for (int i = 0; i < 5; i++) {
            int nums = sc.nextInt();
            listOfNums.add(nums);
        }
        System.out.print(listOfNums);
        Collections.reverse(listOfNums);
        System.out.println(listOfNums);
    }
}
