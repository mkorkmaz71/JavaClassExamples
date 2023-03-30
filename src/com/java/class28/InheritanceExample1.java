package com.java.class28;
class Watch{
    void setBrand(String brandName){
        System.out.println(brandName);
    }
}
class AnalogWatch extends Watch{

    void showTime(int hours, int minutes, int seconds) {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    void showDate(String day) {
        System.out.println(day);
    }
}

class DigitalWatch extends AnalogWatch {
    void showThermometer(int temperature) {
        System.out.println(temperature + " F");
    }
}

public class InheritanceExample1 {

    public static void main(String[] args) {
        Watch w = new Watch();
        w.setBrand("Swatch");
        System.out.println();
        AnalogWatch aw = new AnalogWatch();
        aw.setBrand("Seiko");
        aw.showTime(12, 22, 56);
        aw.showDate("Wed");
        System.out.println();
        DigitalWatch dw = new DigitalWatch();
        dw.setBrand("Casio");
        dw.showTime(10, 12, 45);
        dw.showDate("Fri");
        dw.showThermometer(50);
    }
}
