package com.java.class36;

public class ExceptionClassAssignment {
    public static void main(String[] args) {
        int[]nums={1,5,8,6};
        String name=null;
        try {
            System.out.println(nums[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try {
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }finally {
            System.out.println("I am always executed");
        }
    }
}

