package com.java.class25;

public class HWCarMainClass {
    public static void main(String[] args) {
        HWCar car1 = new HWCar();
        HWCar car2 = new HWCar();
        HWCar car3 = new HWCar();

        car1.brandName = "Honda";
        car1.fuelConsumption = 30;
        car1.awd = true;

        car2.brandName = "Hyundai";
        car2.fuelConsumption = 24;
        car2.awd = false;

        car3.brandName = "Toyota";
        car3.fuelConsumption = 32;
        car3.awd = false;

        car1.makeCall(car1.brandName);
        car2.makeCall(car2.brandName);
        car3.makeCall(car3.brandName);

        car1.isEconomic(car1.fuelConsumption);
        car2.isEconomic(car2.fuelConsumption);
        car3.isEconomic(car3.fuelConsumption);

        car1.moveInTerrain(car1.awd);
        car2.moveInTerrain(car2.awd);
        car3.moveInTerrain(car3.awd);
    }
}
