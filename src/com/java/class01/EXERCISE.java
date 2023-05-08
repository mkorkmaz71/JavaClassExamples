package com.java.class01;

public class EXERCISE {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        int count=0;
        String str="";
        for (int j=0;j<strs[1].length()-2;j++) {
            if(strs[0].substring(0,j+1).equals(strs[1].substring(0,j+1))&&strs[0].substring(0,j+1).equals(strs[2].substring(0,j+1))){
                count++;
                System.out.println(count);
            }
        }
        str=strs[0].substring(0,count);
        System.out.println(str);
    }
}