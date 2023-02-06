package com.java.class14;

public class StringPractice1 {
    public static void main(String[] args) {
        String str="<html>";
        str+="<body>";
        str+="<h1> Hello DevX </h1>";
        str+="</body>";
        str+="</html>";
        System.out.println(str);
        String str1="public class Hello";
        str1=str1.concat("{");
        str1=str1.concat("\n\t{");
        System.out.println(str1);
    }
}
