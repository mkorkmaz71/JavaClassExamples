package com.java.class24;

public class DeclaringTwoDimensionalArray {
    public static void main(String[] args) {
  int names[][]=new int[3][2];//declaration of number of rows and number of columns
  System.out.println(names.length);//number of rows
  System.out.println(names[0].length);//number of columns in row 0

        int name[][]= {{12,12},{14,32},{34,64}};
        for (int i=0;i<name.length;i++){
            for (int j=0;j<name[i].length;j++) {
                System.out.print(name[i][j] + " ");
            }
                System.out.println();
        }
    }
}
