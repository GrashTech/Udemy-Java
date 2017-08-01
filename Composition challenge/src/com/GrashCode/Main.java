package com.GrashCode;

public class Main {

    public static void main(String[] args) {

       // create a single room of a house using composition
        //think about the things that should be included in the room
        //maybe physical parts of the house but mainly furniture
        //add at least one method to access the object via a getter and then that objects public method as you saw in the previous video
        //then add at least one method to hide the object
        //but access the object used in composition within the main class
        // like you saw in this video

        Wall theWall = new Wall("Foundation" , "Red" , 4);
        Tv theTv = new Tv("Samsung" , "42 inch flat screen" , "1920 x 1080P");
        couch theCouch = new couch("Large" , "leather" , 5);

        Room theRoom = new Room(theWall ,theTv , theCouch);
        theWall.lookAtwall();
        theRoom.openDoor();

    }
}
