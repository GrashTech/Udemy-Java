package com.GrashCode;

/**
 * Created by Eric on 17/02/2017.
 */
public class Bank {
    private double accountNo;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNo;

    public Bank()
    {
        this(1234567, 10000 , "Default Name" , "default email", 0000);
        System.out.println("Constructor called");

    }

    public Bank(double accountNo , double balance , String customerName , String email , double phoneNo)
    {

    }

    public Bank(String customerName, String email, double phoneNo) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void setAccountNo(double accountNo)
    {
        this.accountNo = accountNo;
    }

    public double getAccountNo()
    {
        return this.accountNo;
    }


    public void setBalance(double balance)
    {
        this.balance = balance;
    }


    public double getBalance ()
    {
        return this.balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNo(double phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public double getPhoneNo()
    {
        return this.phoneNo;
    }


    public static double makeDeposit(double balance , double depositAmount , double accountNo)
    {
        balance = balance + depositAmount;
        System.out.println("Account Updated");
        System.out.println(accountNo);
        System.out.println("Your Balance is " + balance);
        return balance;
    }


    public static double makeWithdrawal(double balance , double withdrawalAmount , double accountNo)
    {
        if (withdrawalAmount > balance)
        {
            System.out.println("Insuficient Funds");
        }
        else
        {
            balance = balance - withdrawalAmount;
            System.out.println("Account Updated");

            System.out.println("Account Number : " + accountNo);
            System.out.println("Your balance is " + balance);
            return balance;

        }
        return balance;
    }





}
