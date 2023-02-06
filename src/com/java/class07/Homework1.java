package com.java.class07;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Java exercises are you solving per day?");
        int javaExercises = input.nextInt();
        if (javaExercises < 3) {
            System.out.println("You are too lazy");
        }
        if (javaExercises >= 3 && javaExercises < 5) {
            System.out.println("Good Job, but you should do better!");
        }
        if (javaExercises >= 5) {
            System.out.println("Great Job! You are on the right track!");
        }
    }
}
