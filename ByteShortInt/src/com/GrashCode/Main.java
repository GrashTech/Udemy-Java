package com.GrashCode;

public class Main {

    public static void main(String[] args) {
        // integer has a with of 32


        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myToatal = (myMinValue/2);
        System.out.println("My Total = " + myToatal);

        // byte has a width of 8
        byte myByteValue = 12;
        byte myNewByteValue =(byte) (myByteValue/2);
        System.out.println("My new Byte Value = " + myNewByteValue);

        // short hs a width of 16
        short myShortValue = 32_767;
        short myNewShortValue =(short) (myShortValue/2);

        // Long has a width of 64
        long myLongValue = 100L;

        byte validByte = 100;
        short validShort = 12777;
        int validInt = 19951945;
        long validLong = 50_000L + 10L * ( validByte + validShort + validInt);
        short shortTotal =(short) (validShort + 10 * (validByte + validShort + validInt));
        System.out.println("My long value is " + validLong);
        System.out.println("Short Total = " + shortTotal);


    }
}
