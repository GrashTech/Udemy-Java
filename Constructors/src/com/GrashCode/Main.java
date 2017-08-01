package com.GrashCode;

import java.util.Scanner;


public class Main {


            public static Scanner keyboard;


            public static void main(String[] args) {

//                keyboard = new Scanner(System.in);
//                Bank transaction1 = new Bank();
//
//                transaction1.setBalance(10000);
//
//                System.out.println("Please enter Account Number");
//                double number;
//                number = keyboard.nextDouble();
//                transaction1.setAccountNo(number);
//
//                System.out.println("Please Select the transaction you would like to make.");
//                System.out.println("1.withdraw");
//                System.out.println("2.Deposit");
//                System.out.println("3.Exit");
//                int option = keyboard.nextInt();
//
//                switch (option)
//                {
//                    case 1:
//                    {
//                        System.out.println("please enter the amount you wish to withdraw");
//                        double withdrawAmount = keyboard.nextDouble();
//                        transaction1.makeWithdrawal(transaction1.getBalance() , withdrawAmount , number);
//                        break;
//                    }
//
//                    case 2:
//                    {
//                        System.out.println("Please enter the amount you wish to deposit");
//                        double depositeAmount = keyboard.nextDouble();
//                        transaction1.makeDeposit(transaction1.getBalance(), depositeAmount , number);
//                        break;
//                    }
//
//                    case 3:
//                    {
//                        System.out.println("Thank you goodbye");
//                        break;
//                    }
//
//                    case 4:
//                    {
//                        System.out.println("Your balance is ");
//                        System.out.println(transaction1.getBalance());
//                    }
//
//                    default:
//                    {
//                        System.out.println("Error enter valid option");
//                        option = keyboard.nextInt();
//                    }
//
//
//
//                }





                VipCustomer person1 = new VipCustomer();
                System.out.println(person1.getVipName());

                VipCustomer person2 = new VipCustomer("BOB" , 25000);
                System.out.println(person2.getCreditlimit());

            }




}










