package com.GrashCode;

/**
 * Created by Eric on 27/03/2017.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp()
    {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        getMonitor().drawPixelAt(1200,200 , "blue");
    }


   private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
