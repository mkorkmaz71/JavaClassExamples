package com.java.class30;

import java.util.Scanner;

class Browser {

    void openWebsite() {
        System.out.println("Opening Website");
    }

    void doLogin() {
        System.out.println("Logging In");
    }

    void logOut() {
        System.out.println("Logging Out");
    }
}

class Chrome extends Browser {

    @Override
    void openWebsite() {
        System.out.println("Opening Website in Chrome");
    }
}

class Firefox extends Browser {
    @Override
    void openWebsite() {
        System.out.println("Opening Website in Firefox");
    }
}

class Safari extends Browser {
    @Override
    void openWebsite() {
        System.out.println("Opening Website in Safari");
    }
}

public class DynamicPolyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter browser");
        String browser = sc.next();
        Browser br = null;
        if (browser.equalsIgnoreCase("chrome")) {
            br = new Chrome();
        } else if (browser.equalsIgnoreCase("firefox")) {
            br = new Firefox();
        } else if (browser.equalsIgnoreCase("safari")) {
            br = new Safari();
        } else {
            throw new RuntimeException("Invalid browser specified");
        }
        br.openWebsite();
        br.doLogin();
        br.logOut();
    }
}
