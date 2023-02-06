package com.java.class16;

public class WhileLoop1 {
    public static void main(String[] args) {
 /*       String str = "*";
        while (str.length() < 6) {
            System.out.println(str);
            str = str.concat("*");
        }
        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num--;
        }

        String str1 = "*****";
        while (str1.length() > 0) {
            System.out.println(str1);
            str1 = str1.substring(0, str1.length() - 1);

        int num1 = 2;
        while (num1 <= 20) {
            System.out.println(num1);
            num1 = num1 + 2;
*/
            String str2 = "Hello DevXer";
            int num0 = 0;
            int numv = 0;
            int nums = 0;
            int numc = 0;
            while (num0 < str2.length()) {
                if (str2.charAt(num0) == ('a') || str2.charAt(num0) == 'e' || str2.charAt(num0) == 'i' ||
                        str2.charAt(num0) == 'o' || str2.charAt(num0) == 'u' || str2.charAt(num0) == ('A') ||
                        str2.charAt(num0) == 'E' || str2.charAt(num0) == 'I' || str2.charAt(num0) == 'O' || str2.charAt(num0) == 'U') {
                    numv++;
                } else if (str2.charAt(num0) == (' ')) {
                    nums++;
                } else {
                    numc++;
                }
                num0++;
            }
            System.out.println("Total vowels are in \"" + str2 + "\" is " + numv);
            System.out.println("Total spaces are in \"" + str2 + "\" is " + nums);
            System.out.println("Total consonants are in \"" + str2 + "\" is " + numc);
        }
    }

