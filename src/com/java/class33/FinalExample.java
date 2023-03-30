package com.java.class33;

class Parent {
    final void eat() {
        System.out.println("soup");
    }
}

class Child extends Parent {
  //  void eat() {    //no choice
  //      System.out.println("pizza");
  //  }
}

public class FinalExample {
    public static void main(String[] args) {
        final int i = 10;

        System.out.println(i);
    }
}
