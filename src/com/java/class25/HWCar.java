package com.java.class25;

public class HWCar {
    //Write a program to create a Phone Class with variables (property) and methods (actions) inside it.
    //Create a PhoneMainClass and create three different objects of the Phone class
    //Call methods of Phone class using these three different objects
    String brandName;
    int fuelConsumption;
    boolean awd;

    void makeCall(String brandName) {

        System.out.println(brandName + " is moving.");
    }

    void isEconomic(int fuelConsumption) {
        if (fuelConsumption >= 30) {
            System.out.println(brandName + " is an eco car.");
        } else {
            System.out.println(brandName + " is not an eco car.");
        }
    }

    void moveInTerrain(boolean awd) {
        if (awd) {
            System.out.println(brandName + " can be used in the terrain.");
        } else {
            System.out.println(brandName + " can not be used in the terrain.");
        }
    }
}