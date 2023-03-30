package com.java.class25;

public class PersonMainClass {
    public static void main(String[] args) {
   //     int a=10;
   //     System.out.println(a);
        //Create reference of class
        Person aidai;  //Person-class    aidai-object of class


        //Initialize memory for the object
        Person dana=new Person();  //Person-class    dana-object of class
        Person azat=new Person();  //Person() constructor
        System.out.println(dana.name);
        System.out.println(azat.name);

        dana.age=34;
        azat.age=14;

        dana.name="Danaker";
        azat.name="Azat Azamatov";

        dana.run();
        azat.eat();
    }
}
