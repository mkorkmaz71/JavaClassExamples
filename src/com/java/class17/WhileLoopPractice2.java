package com.java.class17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        String str = "SpaceX Mars Mission";
        int length = str.length();
        while(length>0){
            length--;
            System.out.print(str.charAt(length));
        }
    }
}
