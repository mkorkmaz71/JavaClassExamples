package com.java.class22;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int listOfData[]= {10,30,50,30,70,40,45,32};
        int sum=0;
        for (int i=1;i<=listOfData.length;i++){
            sum=sum+listOfData[i-1];
        }
        System.out.println(sum);
    }
}
