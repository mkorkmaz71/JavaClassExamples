package com.java.class07;

public class TypeCasting {
    public static void main(String[] args) {
       //Error types in Java

        //double gasPrice=1.99;
        //int wholenumber=gasPrice;//incompatible types compilation error
        //int b=10.5;
        ///////////////// int a=4000045507;
        //short smallnum=b;


        //explicit type casting
        double price=2.99;
        int convert=(int)price;
        System.out.println(convert);

        double num2=9.01;
        int convert2=(int)num2;
        System.out.println(num2);

        float floatnum=2.44455544455544f;
        //convert floatnum into a byte
        //and printout byte number
        byte convert3=(byte)floatnum;
        System.out.println(convert3);
        //implicit type casting
        int num1=24;
        double doublenum=num1;
        System.out.println(doublenum);

        int num5=55;
        double doublenum2=num5;
        System.out.println(doublenum2);

        //I want get Average Customer Spending on my products
        //I sold $4544955.96
        //64-clients
        double num6=4544950.96;
        int client=64;
        double averageccustomerspening=num6/client;
        System.out.println("Average Customer Spending on my products is $"+averageccustomerspening);

        //I drove 100 miles
        //gallons of gas=2.4
        //how many miles per gallon did I spend

        int range=100;
        double spendGHallons=2.4;
        double milespergallon=range/spendGHallons;
        System.out.println("miles per gallon is "+milespergallon);

    }
}
