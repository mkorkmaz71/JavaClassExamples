package com.java.class25;

public class HWPhoneMainClass {
    public static void main(String[] args) {
        HWPhone phone1 = new HWPhone();
        HWPhone phone2 = new HWPhone();
        HWPhone phone3 = new HWPhone();

        phone1.brandName = "Iphone";
        phone1.memory = 256;
        phone1.camera = true;

        phone2.brandName = "Samsung";
        phone2.memory = 128;
        phone2.camera = true;

        phone3.brandName = "Xiaomi";
       phone3.memory = 16;
        phone3.camera = false;

        phone1.makeCall(phone1.brandName);
        phone2.makeCall(phone2.brandName);
        phone3.makeCall(phone3.brandName);

        phone1.makeSurf(phone1.memory);
        phone2.makeSurf(phone2.memory);
        phone3.makeSurf(phone3.memory);

        phone1.takePicture(phone1.camera);
        phone2.takePicture(phone2.camera);
        phone3.takePicture(phone3.camera);
    }
}
