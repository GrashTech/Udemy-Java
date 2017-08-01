package com.GrashCode;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//
//        while (count != 6) {
//            System.out.println("The count value is " + count);
//            count++;
//
//        }
//        count = 1;
//        do
//        {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        while(count !=6);


//        count = 1;
//
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("The count value is " + count);
//            count++;
//        }
//        int count = 27;
//        int finishCount = 40;
//        int foundEvens = 0;
//        while(count < finishCount)
//        {
//
//            if(!isEvenNumber(count))
//            {
//                count++;
//                continue;
//            }
//
//            count++;
//
//
//        }

        int number = 5;
        int finishNumber = 20;
        int foundEvens = 0;
        while(number < finishNumber)
        {

            if(!isEvenNumber(number))
            {
                number++;
                continue;
            }

            foundEvens++;
            if(foundEvens>=5)
            {
                break;
            }
            System.out.println("Even Number is " + number);
            number++;



        }

        System.out.println("Total of even numbers found " + foundEvens);




    }
    public static boolean isEvenNumber (int count)
    {

            if (count  %2 ==0 ) {
                System.out.println(count + " is an even number.");

                return true;


            }
            else
            {
                return false;
            }

    }
}
