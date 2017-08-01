package com.GrashCode;

public class Main {

    public static void main(String[] args) {
        // System.out.println("10,000 at 2% interest" + calculateInterest(10000, 2));

//         for(int i = 0; i<5;   i++)
//        {
//            System.out.println("Loop " + i + " Hello!");
//        }
//        for(double interestRate =2; interestRate<=8; interestRate++)
//        {
//            System.out.println("10,000 at " + interestRate + "% is  " + calculateInterest(10000 , interestRate));
//        }

//        for (double interestRate = 8; interestRate >= 2; interestRate--) {
//            System.out.println("10,000 at " + interestRate + "% is  " + calculateInterest(10000, interestRate));
//        }


         int i=0;
        for (int n = 2; n<=25; n++)
        {

            isPrime(n);
            if(isPrime(n) )
            {

                System.out.println("Prime Numbers found " + n + " " +"Prime numbers found "  + i);
                i++;
            }
            if(i==3)
            {
                System.out.println("Exiting Loop");
                break;
            }


        }

    }

        public static boolean isPrime(int n)
    {
        if(n==1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}