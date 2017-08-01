package com.GrashCode;

/**
 * Created by Eric on 27/03/2017.
 */
public class couch {
    private String size;
    private String material;
    private int seats;

    public couch(String size , String material , int seats)
    {
        this.seats = seats;
        this.size = size;
        this.material = material;

    }

    public String getSize()
    {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public int getSeats() {
        return seats;
    }
}
