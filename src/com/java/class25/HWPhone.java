package com.java.class25;

public class HWPhone {
    //Write a program to create a Phone Class with variables (property) and methods (actions) inside it.
    //Create a PhoneMainClass and create three different objects of the Phone class
    //Call methods of Phone class using these three different objects
    String brandName;
    int memory;
    boolean camera;

    void makeCall(String brandName) {
        System.out.println(brandName + " is calling.");
    }

    void makeSurf(int memory) {
        if (memory>64){
            System.out.println(brandName + " can surf in the net.");
        }else {
            System.out.println(brandName + " can not surf in the net.");
        }
    }
    void takePicture(boolean camera) {
        if (camera) {
            System.out.println(brandName + " is taking picture.");
        } else {
            System.out.println(brandName + " can not take picture.");
        }
    }
}