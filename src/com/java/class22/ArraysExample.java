package com.java.class22;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
     //Create Array
     int listOfData[]= {10,30,50,30,70,40,45,32};
     int data[]=new int[10];//declaration
     //Print Data from Array   listOfData[]= {0,1,2,3,4,5,6,7,...}
        System.out.println(listOfData[2]);
        System.out.println(listOfData.length);//length of array
        for (int i=0;i<listOfData.length;i++){
            System.out.println(listOfData[i]);
        }
        System.out.println(listOfData);//memory location
        System.out.println(Arrays.toString(listOfData));//data itself

        int[][] data1= new int[5][2];
        String str="hay!";
        String str1="senin";
        System.out.println(str.concat(str1));
        str=str.concat(str1);
        System.out.println(str);
    }
}
