package com.GrashCode;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInches(12 , 45);
        calcFeetAndInches(calcFeetAndInches( 31));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "Scored" + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed PLayer " + "Scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("NO player name , no score");
        return 0;
    }


    /////////////////////////////////////////////////////////////////////////
    public static double  calcFeetAndInches(double feet, double inches) {
        double test = 0;

        if (feet >= 0) {
            double conversion = feet * (12 * 2.54);

            System.out.println("There is " + conversion + "cm in " + feet + " feet");

        } else if(feet<0) {
           test = -1;
        }




        if (inches >= 0) {
            double conversion2;
            conversion2 = inches * 2.54;
            System.out.println("There is " + conversion2 + "cm in " + inches + " inches");
            return  conversion2;

        } else if(inches <0) {
            test =  -1;
        }
       return test;



    }

    public static double calcFeetAndInches(double inches) {
        double test = 0;
        if (inches >= 0) {
            double conversion2 = inches * 2.54;
            System.out.println("There is " + conversion2 + "cm in " + inches + " inches");


        } else if (inches >0){
            test = -1;

        }
        return test;


    }
}
