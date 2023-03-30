package com.java.class26;

public class Watch {
    String brandName;
    String type;
    int price;




Watch(){
    System.out.println("From no arg Constructor");
}

Watch(String brandNameFromUser, String typeFromUser ){
    System.out.println(brandNameFromUser+" has "+typeFromUser);
}
Watch(int priceFromUser){
        System.out.println(brandName+" is "+priceFromUser);
    }

}