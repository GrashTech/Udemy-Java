package com.GrashCode;

/**
 * Created by Eric on 27/03/2017.
 */
public class Room {
    private Wall theWall;
    private Tv theTv;
    private couch theCouch;

    public Room(Wall theWall, Tv theTv, couch theCouch) {
        this.theWall = theWall;
        this.theTv = theTv;
        this.theCouch = theCouch;
    }


    public void openDoor()
    {
        getTheWall().lookAtwall();
        checkWeather();
    }

    public void checkWeather()
    {
        System.out.println("Its sunny outside the window");
    }




   private Wall getTheWall() {
        return theWall;
    }

    private Tv getTheTv() {
        return theTv;
    }

    private couch getTheCouch() {
        return theCouch;
    }
}
