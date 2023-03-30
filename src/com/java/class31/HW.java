package com.java.class31;

class Phone {
    void call() {
        System.out.println("Phone calling");
    }

    void text() {
        System.out.println("Phone texting");
    }

    void repair() {
        System.out.println("Phone repairing");
    }
}

class AndroidPhone extends Phone {
    @Override
    void repair() {
        System.out.println("Android Phone repairing");
    }
}

class IPhone extends Phone {
    @Override
    void repair() {
        System.out.println("IPhone repairing");
    }
}

class ServiceCenter {
    void servicePhone(Phone phone) {
        phone.repair();
    }
}

public class HW {
    public static void main(String[] args) {
        AndroidPhone ap = new AndroidPhone();
        IPhone ip = new IPhone();
        ServiceCenter sc = new ServiceCenter();
        sc.servicePhone(ap);
        sc.servicePhone(ip);
    }
}
