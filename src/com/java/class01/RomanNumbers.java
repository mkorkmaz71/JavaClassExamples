package com.java.class01;

public class RomanNumbers {
    public static void main(String[] args) {
        String s = "MCMDCXIXIVII";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i == s.length() - 1) {
                        num = num + 1;
                        break;
                    } else {
                        if (s.charAt(i + 1) == 'V') {
                            num = num + 4;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'X') {
                            num = num + 9;
                            i++;
                            break;
                        } else {
                            num = num + 1;
                            break;
                        }
                    }
                case 'V':
                    num = num + 5;
                    break;
                case 'X':
                    if (i == s.length() - 1) {
                        num = num + 10;
                        break;
                    } else {
                        if (s.charAt(i + 1) == 'L') {
                            num = num + 40;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'C') {
                            num = num + 90;
                            i++;
                            break;
                        } else {
                            num = num + 10;
                            break;
                        }
                    }
                case 'L':
                    num = num + 50;
                    break;
                case 'C':
                    if (i == s.length() - 1) {
                        num = num + 100;
                        break;
                    } else {
                        if (s.charAt(i + 1) == 'D') {
                            num = num + 400;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'M') {
                            num = num + 900;
                            i++;
                            break;
                        } else {
                            num = num + 100;
                            break;
                        }
                    }
                case 'D':
                    num = num + 500;
                    break;
                case 'M':
                    num = num + 1000;
                    break;
            }
        }
        System.out.println(num);
    }

}
