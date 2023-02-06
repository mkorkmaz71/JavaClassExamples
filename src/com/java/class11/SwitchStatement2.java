package com.java.class11;

public class SwitchStatement2 {
    public static void main(String[] args) {

        String shipmentState = "Hawaii";
        switch (shipmentState) {
            case "Alaska":
            case "Hawaii":
                System.out.println("shipment cost $10");
                break;
            case "NY":
                System.out.println("shipment cost $5");
                break;
            case "Florida":
                System.out.println("shipment cost $7");
                break;
            case "California":
                System.out.println("shipment cost $12");
                break;
        }
    }
}
