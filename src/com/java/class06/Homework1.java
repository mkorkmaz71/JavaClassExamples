package com.java.class06;

public class Homework1 {
    public static void main(String[] args) {

        String username="steve@apple.com";
        String password="infinityLoop1";
        String location="california";

        boolean login;
        login= username.equals("steve@apple.com") && password.equals("infinityLoop1") && location.equals("california");
        System.out.println("You are logged in " + login);
    }


}
