package com.java.class33;
abstract class Bank{
    int balance;
    public abstract void disPlayRateOfInterest();
    public void withdraw(int amount){
        balance=balance-amount;
    }
}
class CitiBank extends Bank{
    public void disPlayRateOfInterest(){
        System.out.println("6.0");
    }
}
class ChaseBank extends Bank{
    public void disPlayRateOfInterest(){
        System.out.println("6.0");
    }
}
public class ExampleOfAbstractionClass {
    public static void main(String[] args) {
    //    Bank bank=new Bank();  //we cannot create object of abstract class
    //        bank.disPlayRateOfInterest();

    }
}

