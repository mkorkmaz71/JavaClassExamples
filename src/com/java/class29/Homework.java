package com.java.class29;
class Food{
    Food(){
        this("Beef Steak");
        System.out.println("From Food");
    }
    Food(String name){
        System.out.println(name+" is a food");
    }
}
class VegFood extends Food{
    VegFood(){
        this("Potatoes");
        System.out.println("From VegFood");
    }
    VegFood(String vegetableName){
        super("Lentils");
        System.out.println(vegetableName+" is a veggy food");
    }
}
class Salad extends VegFood{
    Salad(){
        this(true);
        System.out.println("From Salad");
    }
    Salad(boolean withSauce){
        super("Tomatoes");
        System.out.println("Salad with sauce");
    }
}
public class Homework {
    public static void main(String[] args) {
        Salad s1=new Salad();
    }
}
