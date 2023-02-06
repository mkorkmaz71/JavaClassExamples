package com.java.class15;

import java.util.Locale;

public class Trim {
    public static void main(String[] args) {
        String str="     Hello DevX!    ";//trim cuts spaces in the front and back. nothing for inside
        System.out.println(str);
        System.out.println(str.trim());
        String str21= str.toUpperCase().trim();
        System.out.println(str21);
        String str2=str.trim().replace("D","T");
        System.out.println(str2);
        String str3=str.replace("ll","ard");
        System.out.println(str3.trim().concat(str3).concat(str3));
        String str12= "System.out.println(HelloWorld)";
        str12=str12.replace(")",");");
        System.out.println(str12);
        String str13= "system.out.println(HelloWorld);";
        str13=str13.replaceFirst("s","S");
        System.out.println(str13);
        String str14= "I hate Java, I hate Programming";
        str14=str14.replaceFirst("hate","love");
        System.out.println(str14);
        }
    }

