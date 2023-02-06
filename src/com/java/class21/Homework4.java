package com.java.class21;

public class Homework4 {
    public static void main(String[] args) {
//Write a program to print the below pattern
//*
//**
//***
//****
//*****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
