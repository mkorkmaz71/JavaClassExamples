package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        //store data into the list
        listOfNum.add(40);
        listOfNum.add(34);
        listOfNum.add(65);
        listOfNum.add(32);

        System.out.println(listOfNum.contains(65));
        System.out.println(listOfNum.isEmpty());
        System.out.println(listOfNum.indexOf(65));
        System.out.println(listOfNum.lastIndexOf(65));
        Collections.sort(listOfNum);//ascending order
        System.out.println(listOfNum);
        Collections.reverse(listOfNum);//descending order
        System.out.println(listOfNum);
    }
}
