package com.GrashCode;

/**
 * Created by Eric on 27/03/2017.
 */
public class Wall {
    private String type;
    private String colour;
    private int windows;

    public Wall(String type , String colour , int windows)
    {
        this.type = type;
        this.colour = colour;
        this.windows = windows;
    }

    public void lookAtwall()
    {
        System.out.println("You see a wall" );
    }

    public String getType()
    {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getWindows() {
        return windows;
    }


}
