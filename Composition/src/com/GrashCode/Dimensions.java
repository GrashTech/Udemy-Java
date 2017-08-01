package com.GrashCode;

/**
 * Created by Eric on 07/03/2017.
 */
public class Dimensions {
    private int depth;
    private int width;
    private int height;

    public Dimensions(int depth , int height , int width)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
