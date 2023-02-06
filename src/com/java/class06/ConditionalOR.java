package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {

        int age =25;
        boolean givediscount= age>60 || age<8;
        System.out.println(givediscount);

        int mage =61;
        boolean givediscount1= mage>60 || mage<8;
        System.out.println(givediscount1);

        int currentTime=13;
        boolean drinkcoffee= currentTime>6 && currentTime<11;
        System.out.println(drinkcoffee);

        int currentTime1=10;
        boolean drinkcoffee1= currentTime1>6 && currentTime1<11;
        System.out.println(drinkcoffee1);

        int howmanyJavaExercises=4;
        int howmanySoftkillsVideos=2;
        boolean gettingrest= howmanyJavaExercises>=5 || howmanySoftkillsVideos>=2;
        System.out.println(gettingrest);

        int loginAttempt=4;
        double transactionamount=1500.0;
        String locationofTransaction="USA";
        boolean block= loginAttempt>3 || transactionamount>3000 || locationofTransaction !="USA";
        System.out.println(block);



    }
}
