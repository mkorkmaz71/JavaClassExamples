package com.java.class11;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of spent money");
        double spentMoney = input.nextDouble();
        System.out.println("Please enter shipping country");
        String country = input.next();
        if (spentMoney >= 1) {
            switch ((int) spentMoney) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Shipping cost is $5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Shipping cost is $10");
                    break;
                default:
                switch (country) {
                    case "USA":
                        System.out.println("Shipping cost is $" + spentMoney * 0.1);
                        break;
                    case "Canada":
                        System.out.println("Shipping cost is $" + spentMoney * 0.15);
                        break;
                    case "Europe":
                        System.out.println("Shipping cost is $" + spentMoney * 0.20);
                        break;
                    default:
                        System.out.println("Shipping cost is $" + spentMoney * 0.25);
                }
            }
        } else {
            System.out.println("Invalid input");

        }

    }
}
