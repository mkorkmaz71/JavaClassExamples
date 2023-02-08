package com.java.class24;

public class DisplayArrayInTableForm {
    public static void main(String[] args) {
        int name[][] = {{3, 5, 7},
                        {5, 7, 2},
                        {6, 3, 1}};
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
                sum = sum + name[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" "+sum);
            sum=0;
        }
    }
}
