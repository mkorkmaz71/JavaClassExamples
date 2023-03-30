package com.java.class32;
class Phone {
    private String color;
    private String model;
    private String brand;
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setMemory(6000);
        System.out.println(p.getMemory());
    }
}
