package com.GrashCode;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//	if(score < 5000 && score >1000)
//    {
//        System.out.println("your score was " + score);
//
//    }
//    else if(score <1000)
//    {
//        System.out.println("youre score was less than 1000");
//    }
//    else
//    {
//        System.out.println("got here");
//    }
//    }

        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        int secondScore = 10000;
        int levelcomplete2 = 8;
        int bonus2 = 200;
        if(gameOver)
        {
            int finalScore = secondScore + (levelcomplete2 * bonus2);
            System.out.println("Round 2: Your final score was " + finalScore);
        }
    }
}