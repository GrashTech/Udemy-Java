package com.GrashCode;

/**
 * Created by Eric on 01/03/2017.
 */
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;



    public Fish(String name, int gills , int eyes , int fins , int size, int weight) {
        super(name, 1, 1, size, weight);

        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {

    }

    private void moveMuscles()
    {

    }

    private void moveBackfin()
    {

    }

    private void swim(int speed)
    {
        moveMuscles();
        moveBackfin();
        super.move(speed);

    }

}
