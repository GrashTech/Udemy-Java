package com.GrashCode;

public class Main {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int displayPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("tim ", displayPosition);
        displayPosition = calculateHighScorePosition(900);
        displayHighScorePosition("kyle ", displayPosition);
        displayPosition = calculateHighScorePosition(400);
        displayHighScorePosition("jeoff ", displayPosition);
        displayPosition = calculateHighScorePosition(50);
        displayHighScorePosition("jane ", displayPosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        } else {
            return -1;
        }

    }


    public static void displayHighScorePosition(String playerName, int positionInTable) {
        System.out.println(playerName + "manged to get into position " + positionInTable + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {

            return 1;

        } else if (playerScore >= 500 && playerScore < 1000) {

            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {

            return 3;
        } else {

            return 4;

        }


    }


//        calculateHighScorePosition(900);
//        calculateHighScorePosition(400);
//        calculateHighScorePosition(50);
}
