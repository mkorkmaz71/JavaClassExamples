package com.java.class05;

public class ConditionalAnd {
    public static void main(String[] args) {

        boolean givesezimCertificate=false;
        double sezimgpa=4.0;
        int sezimmissedclasses=3;
        givesezimCertificate=sezimgpa>=3.5 && sezimmissedclasses<3;
        System.out.println(givesezimCertificate);

        boolean giveMustafaCertificate=false;
        double Mustafagpa=3.7;
        int Mustafamissedclasses=0;
        giveMustafaCertificate=Mustafagpa>=3.5 && Mustafamissedclasses<3;
        System.out.println(giveMustafaCertificate);

        boolean issueMustafaDL=false;
        int Mustafaage=51;
        boolean Mustafapassport=true;
        issueMustafaDL=Mustafaage>16 && Mustafapassport;
        System.out.println(issueMustafaDL);
    }
}
