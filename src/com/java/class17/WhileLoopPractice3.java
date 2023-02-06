package com.java.class17;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        String str = "Mustafa Korkmaz";
        int length = str.length();
        while(length>0){
           System.out.print(str.charAt(--length));
        }
    }
}
