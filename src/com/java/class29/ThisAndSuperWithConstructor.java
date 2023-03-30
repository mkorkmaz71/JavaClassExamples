package com.java.class29;

class Drink {

}

class HotDrink extends Drink {
    HotDrink() {
        System.out.println("Hotdrinks");
    }

    HotDrink(String name) {
        System.out.println(name);
    }
}

class Tea extends HotDrink {
    Tea() {
        this("Original");//this has to be a first statement only
        System.out.println("Prep tea");
    }

    Tea(String flavour) {
        this("Masala", true);//this has to be a first statement only
        System.out.println("Prep tea with flavour " + flavour);
    }

    Tea(String flavour, boolean withSugar) {
        System.out.println("Prep tea with flavour " + flavour);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Tea tea = new Tea();
    }
}
