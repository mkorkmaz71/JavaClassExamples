package com.java.class25;

public class Dog {
    String name;  //Variables
    int age;      //Variables
    char gender;  //Variables

    Dog(String nameFromUser, int ageFromUser) {  //Constructor
        name = nameFromUser;
        age = ageFromUser;
    }
    Dog(){  //Constructor

    }
    void bark() {  //Methods
        System.out.println(name + " is barking");
    }

    void play() {    //Methods
        System.out.println(name + " is playing");
    }
}