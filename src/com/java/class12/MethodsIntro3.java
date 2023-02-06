package com.java.class12;

public class MethodsIntro3 {
    public static void main(String[] args) {
        boolean result = inTrouble(5, false);
        System.out.println(result);
    }

    public static boolean inTrouble(int time, boolean parrotTalking) {
        if (parrotTalking) {
            if (time < 7) {
                return true;
            } else if (time > 20) {
                return true;
            }
        } else {
            return false;
        }
    return false;
    }
}

























