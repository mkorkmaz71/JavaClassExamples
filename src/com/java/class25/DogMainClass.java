package com.java.class25;

public class DogMainClass {
    public static void main(String[] args) {
        Dog sharik = new Dog("sharik", 15);

        Dog jhonty=new Dog();
        Dog rani=new Dog();
        Dog lessie=new Dog("lessie",8);
        sharik.bark();
        jhonty.play();
        rani.bark();
        lessie.play();
    }
}
