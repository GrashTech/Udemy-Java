package com.GrashCode;

/**
 * Created by Eric on 27/03/2017.
 */
public class Tv {
    private String model;
    private  String manufacturer;
    private String resolution;

    public Tv(String model, String manufacturer, String resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getResolution() {
        return resolution;
    }
}
