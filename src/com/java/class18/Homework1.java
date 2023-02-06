package com.java.class18;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
/*Write a to take the opening balance and the account name from the user and display the below
operations that the user can perform, at the end ask user if they want to perform more operations
and then continue the same process until a user enters ‘NO’
Output
Welcome to the ATM Machine
Please enter your account opening balance: 1000
Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
1
Please enter the amount you want to withdraw: 500
The available balance is: 500
Do you want to perform more operations?
Press 1 for yes, Press 2 for No
1
Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
2
Please enter the amount you want to deposit: 500
The available balance is: 1000
Do you want to perform more operations?
Press 1 for yes, Press 2 for No
2
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your account opening balance: ");
        double openningBalance = sc.nextDouble();
        int cont;
        double withdraw, deposit;
        do {
            System.out.println("Please choose the operations you want to perform\n" +
                    "1) Withdraw\n" +
                    "2) Deposit\n" +
                    "3) Check Balance");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the amount you want to withdraw: ");
                    withdraw= sc.nextDouble();
                    if(withdraw<=openningBalance){
                        openningBalance=openningBalance-withdraw;
                        System.out.println("The available balance is: "+openningBalance);
                    }else{
                        System.out.println("You don't have enough money to perform!");
                    }
                    break;
                case 2:
                    System.out.println("Please enter the amount you want to deposit: ");
                    deposit= sc.nextDouble();
                    openningBalance=openningBalance+deposit;
                    System.out.println("The available balance is: "+openningBalance);
                    break;
                case 3:
                    System.out.println("The available balance is: "+openningBalance);
                    break;
                default:
                    System.out.println("Wrong Entry!");
            }
            System.out.println("Do you want to perform more operations? ");
            System.out.println("Press 1 for yes, Press 2 for No ");
            cont = sc.nextInt();
        } while (cont == 1);
    }
}
