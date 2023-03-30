package com.java.class29;

class Vehicle {
Vehicle(){
    System.out.println("From Vehicle");
}
}

class Car extends Vehicle {
Car(){
    System.out.println("From Car");
}
}

class SportsCar extends Car {
SportsCar(String name){
    System.out.println("From SportsCar");
}
}


public class ConstructorChaining {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2= new SportsCar("Audi");
    }
}
