package com.java.class27;

class Car {
    static int price = 600;//static variable
    int speed = 200;   //instance variable

    void drive() {
        int speed = 100;   //local variable
        System.out.println(speed);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // int num=10;  // Local variable must be initialized before use
        //  System.out.println(num);
        Car c = new Car();// c name of object
        System.out.println(c.speed);//instance
        System.out.println(Car.price);// static
        System.out.println(c.price);//static
        c.drive();  //local
    }
}
