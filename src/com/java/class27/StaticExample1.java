package com.java.class27;
class Car1 {
       int speed = 200;   //instance variable

    static void drive() {
        //inside the static method you can only use static variables
        //System.out.println(speed);
    }
}

public class StaticExample1 {
    public static void main(String[] args) {
        // int num=10;  // Local variable must be initialized before use
        //  System.out.println(num);
        Car1 c=new Car1();
        Car1.drive();//we can call static method without creating object
    }
}
