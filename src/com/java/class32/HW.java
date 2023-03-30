package com.java.class32;

class Person {
    private String name;
    private Long idNum;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getIdNum() {
        return idNum;
    }

    public void setIdNum(Long idNum) {
        this.idNum = idNum;
    }
}

public class HW {
    public static void main(String[] args) {
        Person one = new Person();
        one.setName("Mustafa Korkmaz");
        one.setIdNum(231564897L);
        one.setAddress("Addison, IL");
        System.out.println("Name      : " + one.getName());
        System.out.println("ID Number : " + one.getIdNum());
        System.out.println("Address   : " + one.getAddress());
    }
}
