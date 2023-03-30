package com.java.class28;
class Phone{
    void call(String brandName){
        System.out.println(brandName+" is calling");
    }
    void text(String brandName){
        System.out.println(brandName+" is texting");
    }
    Phone(){
        System.out.println("Message from Phone");
    }
}
class Iphone extends Phone{

    void callSiri(String model) {
        System.out.println(model+" can utilize Siri");
    }

    void takeSelfie(String model) {
        System.out.println(model+" can take Selfie");
    }
    Iphone(){
        System.out.println("Message from Iphone");
    }
}

class IphonePro extends Iphone{
    void rotate(String model) {
        System.out.println(model+" can rotate");
    }

    void bend(String model) {
        System.out.println(model+" can bend");
    }
    IphonePro(){
        System.out.println("Message from IphonePro");
    }
}

public class InheritanceExample2 {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("Samsung");
        p.text("Xiaomi");
        System.out.println();
        Iphone i = new Iphone();
        i.call("Iphone");
        i.text("Iphone");
        i.callSiri("13");
        i.takeSelfie("13");
        System.out.println();
        IphonePro ip = new IphonePro();
        ip.call("IphonePro");
        ip.text("IphonePro");
        ip.callSiri("14 Pro");
        ip.takeSelfie("14 Pro");
        ip.rotate("14 Pro");
        ip.bend("14 Pro");
    }
}
