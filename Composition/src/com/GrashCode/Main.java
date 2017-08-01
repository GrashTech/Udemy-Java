package com.GrashCode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20 , 20 , 5);
        Case theCase = new Case("220b" , "dell" , "450w" , dimensions);
        Monitor theMonitor = new Monitor("27 inch monster" , "AOC" , 27 , new Resolution(1920 , 1080));
        Motherboard motherboard = new Motherboard("220b" , "Asus" , 6 , 4 , "BIOS 224");

        PC thePc = new PC(theCase , theMonitor , motherboard);
        thePc.powerUp();

    }
}
