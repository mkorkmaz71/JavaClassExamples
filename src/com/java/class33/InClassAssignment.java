package com.java.class33;
abstract class Phone{
    abstract void call();
    abstract void text();
    void takePics(){
        System.out.println("Phone taking pictures");
    }
    void makeSurf(){
        System.out.println("Phone surfing in the web");
    }
}
class IPhone extends Phone{

    @Override
    void call() {
        System.out.println("IPhone is calling");
    }

    @Override
    void text() {
        System.out.println("IPhone is texting");
    }
}
public class InClassAssignment {
    public static void main(String[] args) {
        Phone p=new IPhone();
        p.call();
        p.text();
        p.takePics();
        p.makeSurf();
    }
}
