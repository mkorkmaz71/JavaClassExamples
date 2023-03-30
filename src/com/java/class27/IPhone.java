package com.java.class27;

public class IPhone {
    static String brandName = "Iphone";
    static String operatingSystem = "IOS";
    int memory;
    double price;
    String model;

    static void isCalling() {
        System.out.println(brandName + " is calling.");
    }

    void setPrice(int memory, double price) {
        if (memory > 64) {
            System.out.println("The price of " + model +
                    " with " + memory + "GB memory is " + price);
        } else {
            System.out.println("Your phone memory is not sufficient to utilize " +
                    "all aspects.");
        }
    }
    public static void main(String[] args) {
        IPhone a=new IPhone();
        IPhone b=new IPhone();
        System.out.println(IPhone.brandName);
        System.out.println(IPhone.operatingSystem);
        System.out.println(a.brandName);
        a.setPrice(16,690.00);
        b.setPrice(128,999.99);
        a.isCalling();
        a.memory=16;
        b.price=999.99;
        System.out.println(a.memory);
        System.out.println(b.price);
    }
}

