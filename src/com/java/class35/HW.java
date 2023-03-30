package com.java.class35;
import java.util.Scanner;
enum DaysOfWeek1 {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
    int day;
    DaysOfWeek1(int day){
        this.day = day;
    }
}
public class HW {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input a number to see the day of the week");
        int dayOfWeek= sc.nextInt();
        DaysOfWeek1[] orderOfDay = DaysOfWeek1.values();
        System.out.println(orderOfDay[dayOfWeek]);
    }
}
