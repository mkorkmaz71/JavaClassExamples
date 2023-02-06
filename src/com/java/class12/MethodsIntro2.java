package com.java.class12;

public class MethodsIntro2 {
    public static void main(String[] args) {
        boolean result = canWeSleepIn(4, false);
        System.out.println(result);
    }

    public static boolean canWeSleepIn(int dayOfWeek, boolean isVacation) {
        if (isVacation) {
            return true;
        } else if (dayOfWeek <= 5) {
            return false;
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            return true;
        } else {
            return false;
        }
    }
}
