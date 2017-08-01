package com.GrashCode;

public class Main {

    public static void main(String[] args) {


        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1=" + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result );

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println();


        boolean isAlien = false;
        //conditional code == if statments
        if(isAlien == false)
        {
            System.out.println("it is not an alien");

        }

        int topScore = 78;
        if(topScore >= 100)
        {
            System.out.println("you got the top score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && (topScore < 100))
        {
            System.out.println("Greater than second score and less than 100");
        }


        // important ternery operaters NEWWWW
            boolean isCar = true;
            boolean wasCar = isCar ? true : false;
            if(wasCar)
            {
                System.out.println("was car is true");
            }

            double value = 20;
            double value2 = 80;
            double value3 = (value + value2) * 25;
            double value4 = value3 % 40;
            if( value4 <= 20)
            {
                System.out.println("Total was over the limit");
            }



    }
}
