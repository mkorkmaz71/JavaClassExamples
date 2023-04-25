package com.java.class01;

public class EXERCISE {
    public static void main(String[] args) {
        String[]strs= {"flower","flow","flight"};
        int count=0;
        String str="";
        int min=strs[0].length();
        for (int i=0;i<strs.length;i++) {
           if(strs[i].length()<min) {
               min=strs[i].length();
           }
        }
       for (int i=0;i<strs.length;i++) {
       for (int j=0;j<min-3;j++) {
            if(strs[i].charAt(j)==(strs[i+1].charAt(j))&&strs[i].charAt(j)==(strs[i+2].charAt(j))){
                count++;
            }
        }}
        str=strs[0].substring(0,count);
        System.out.println(str);
    }
}
