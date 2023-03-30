package com.java.class28;

class Calculater {     //Parent / Super Class
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class AdvancedCalculater extends Calculater {    //Child / Sub Class
    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Calculater c = new Calculater();
        c.add(10, 20);
        c.sub(40, 20);

        AdvancedCalculater ac = new AdvancedCalculater();
        ac.div(10, 5);
        ac.mul(12, 6);
        ac.add(15, 20);
        ac.sub(40, 15);
    }
}
