package com.java.class31;
class Bank{
    void withdraw(){
        System.out.println("Parent Withdraw");
    }
    void deposit(){
        System.out.println("Parent Deposit");
    }
    void displayRateOfInterest(){
        System.out.println("Parent rate of Interest");
    }
}
class ChaseBank extends Bank{
    @Override
    void displayRateOfInterest(){
        System.out.println("Child rate of Interest Chase");
    }
    void takeQuickLoan(){
        System.out.println("Child take quick loan");
    }
}
class CitiBank extends Bank{
    @Override
    void displayRateOfInterest(){
        System.out.println("Child rate of Interest Citi");
    }
}
class Paypal {
    void displayRateOfInterest(Bank bank){
        bank.displayRateOfInterest();
    }
}
    public class DynamicPolymorphismRealTimeExample {
        public static void main(String[] args) {
            Bank b=new ChaseBank();
            b.displayRateOfInterest();
            b.deposit();
            b.withdraw();
            System.out.println();
            ChaseBank cb=new ChaseBank();
            cb.displayRateOfInterest();
            cb.deposit();
            cb.withdraw();
            System.out.println();
            ChaseBank chiragCB=new ChaseBank();
            CitiBank chiragciti=new CitiBank();
            Paypal chiragPaypal=new Paypal();
            chiragPaypal.displayRateOfInterest(chiragCB);
            chiragPaypal.displayRateOfInterest(chiragciti);


        }
    }




