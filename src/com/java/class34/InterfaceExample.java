package com.java.class34;

interface Bank {
    int a=121;
    void displayRateOfInterest();

    void withdraw(int amount);

    void deposit(int amount);
}
interface InternationalBank extends Bank{
    void displaySwiftCode();
    void displayRateOfInterest();
}
class Citibank implements InternationalBank {
    @Override
    public void displayRateOfInterest() {
        System.out.println(a);
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void displaySwiftCode() {

    }
}
class Chasebank implements Bank{
    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}

public class InterfaceExample {

}
