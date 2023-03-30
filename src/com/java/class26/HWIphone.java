package com.java.class26;

public class HWIphone {
    /*Task 1:
Write a program to create an IPhone Class with variables (property) and
methods (actions) inside it. Create three constructors inside the IPhone
class. Identify and create static variables inside the IPhone class
(Brainstorm on which variables can be static in IPhone Class ). Create an
IPhoneMainClass and use these three constructors to create three different
objects. Set static variable value for each object & Print all the values
Using three objects call methods of IPhone class*/
    static String brandName = "Iphone";
    String model;
    int memory;
    static boolean isMemoryExtendable = false;
    double price;

    HWIphone(boolean isMemoryExtendable) {
        System.out.println(brandName + " memory can not be extended");
    }

    HWIphone() {
        System.out.println(brandName + " is calling.");
    }

    HWIphone(String model, int memory, double price) {
        if (memory > 64) {
            System.out.println("The price of " + brandName + " " + model +
                    " with " + memory + "GB memory is " + price);
        } else {
            System.out.println("Your phone memory is not sufficient to utilize " +
                    "all aspects.");
        }
    }
}
