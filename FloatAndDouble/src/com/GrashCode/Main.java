package com.GrashCode;

public class Main {

    public static void main(String[] args) {
        // width of int is 32 (4 bytes).
        int myIntValue = 5/3;
        // width of a float is 32 (4 bytes).
        float myFloatValue = 5f/3f;
        // width of a double is 64 (8 bytes).
        double myDoubleValue = 5d/3d;
        System.out.println("my int value = " + myIntValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value =" + myDoubleValue);

        double kiloPerPound = 0.4535_9237d;
        double pounds = 200d;
        double kilograms = pounds * kiloPerPound;
        System.out.println("Total in kilos = " + kilograms);
    }
}
