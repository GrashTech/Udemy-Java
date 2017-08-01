package com.GrashCode;

public class Main {

    public static void main(String[] args) {
//
    int switchValue = 2;int value = 1;
//	if (value == 1)
//    {
//        System.out.println("Value was one");
//
//    }
//    else if (value ==2)
//    {
//
//        System.out.println("Value was two");
//
//    }


        switch(switchValue)
    {
        case 1:
            System.out.println("Value was one");
            break;
        case 2:
            System.out.println("value was two");
            break;

            default:
                System.out.println("was not one or two");
    }

    char switchChar = 'f';

        switch(switchChar)
        {
            case 'a':
                System.out.println("Value was A");
                break;

            case 'b':
                System.out.println("Value was B");
                break;

            case 'c':
                System.out.println("Value was C");
                break;

            case 'D':
                System.out.println("Value was D");
                break;

             default:
                 System.out.println("Was not A, B, C, or D" + " " +  "No value found");



        }
    }
}
