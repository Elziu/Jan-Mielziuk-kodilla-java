package com.kodilla.rps.rpsbuild;

import java.util.Scanner;

public class RpsCore extends ComputerMove{

    Scanner input = new Scanner(System.in);

     String nickname;
     int playerWinCount = 0;
     int computerWinCount = 0;
     int pointsRequiredToWin;


    public void setNickname(){

        System.out.println("What is your nickname?");
        nickname = input.nextLine().toUpperCase();
        System.out.println("Hello " + nickname + "!");

    }

    public int setPointsRequiredToWin(){

        System.out.println("How many points do we need to win a game?");
        pointsRequiredToWin = input.nextInt();
        return pointsRequiredToWin;
    }

    public void computerWin() {
        computerWinCount++;
        System.out.println("Computer won this round! \n" + nickname + " " + playerWinCount + " : " + computerWinCount + " COMPUTER \n" );
    }

    public void playerWin() {
        playerWinCount++;
        System.out.println("You won this round! \n" + nickname + " " + playerWinCount + " : " + computerWinCount + " COMPUTER \n" );
    }

    public void draw() {
        System.out.println("DRAW. \n" +
                nickname + " " + playerWinCount + " : " + computerWinCount + " COMPUTER \n");
    }


    public void startFromTheBeginning() {
        playerWinCount = 0;
        computerWinCount = 0;
    }

    public void computerFinalWin() {
        System.out.println("GAME OVER! \nCOMPUTER WON! \n" +
                "Final result: \n" + nickname + ": " + playerWinCount + " points, Computer: " + computerWinCount + " points");
    }

    public void playerFinalWin() {
        System.out.println("GAME OVER!\n" + "The winner is: " + nickname + "\n" +
                "Final result: \n" + nickname + ": " + playerWinCount + " points, COMPUTER: " + computerWinCount + " points");
    }

    public void gameOver() {

        if (computerWinCount > playerWinCount) {
            computerFinalWin();

        } else {
            playerFinalWin();
        }
    }




}
