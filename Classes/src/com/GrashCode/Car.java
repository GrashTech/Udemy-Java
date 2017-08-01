package com.GrashCode;

/**
 * Created by Eric on 16/02/2017.
 */
// public = access modifier, public means unrestricted access to the class
// other access modifiers private , protected and can be removed (notes later on)
public class Car {


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden"))
        {
            this.model = model;
        }

        else
        {
            this.model = "Unkown Model";
        }

    }

    public String getModel()
    {
        return this.model;
    }





}
