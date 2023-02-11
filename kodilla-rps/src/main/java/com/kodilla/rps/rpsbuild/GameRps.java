
package com.kodilla.rps.rpsbuild;



public class GameRps extends MoveComparison {

    public GameRps() {


        RpsCore rpsCore = new RpsCore();


        boolean end = false;

        System.out.println("Welcome in ROCK/PAPER/SCISSORS!");
        rpsCore.setNickname();





        while (!end) {

            rpsCore.setPointsRequiredToWin();
            System.out.println("Number of points required to win is: " + rpsCore.pointsRequiredToWin);


            label:
            while (!end){

                System.out.println(
                        """
                                Key 1 – play "ROCK".
                                Key 2 – play "PAPER".
                                Key 3 – play "SCISSORS".
                                Key x – end game.
                                Key n – restart the game.""");

                String playerChoice = input.nextLine().toUpperCase();

                switch (playerChoice) {
                    case "X" -> {
                        System.out.println("Are you sure? Press: Y - yes or N - no");
                        playerChoice = input.nextLine().toUpperCase();
                        if (playerChoice.equals("Y")) {
                            System.out.println("Thanks for playing!");
                            end = true;
                        }
                    }
                    case "N" -> {
                        System.out.println("Do you really want to delete this game? Press: Y - yes or N - no");
                        playerChoice = input.nextLine().toUpperCase();
                        if (playerChoice.equals("Y")) {
                            rpsCore.startFromTheBeginning();
                            break label;

                        }
                    }
                    case "1", "2", "3" -> {
                        String computerChoice = computerMove() + "";
                        String result = moveComparison(playerChoice, computerChoice);
                        switch (result) {
                            case "draw" -> rpsCore.draw();
                            case "player" -> {
                                rpsCore.playerWin();
                                if (rpsCore.computerWinCount == rpsCore.pointsRequiredToWin || rpsCore.playerWinCount == rpsCore.pointsRequiredToWin) {
                                    rpsCore.gameOver();
                                    end = true;
                                }
                            }
                            case "computer" -> {
                                rpsCore.computerWin();
                                if (rpsCore.computerWinCount == rpsCore.pointsRequiredToWin || rpsCore.playerWinCount == rpsCore.pointsRequiredToWin) {
                                    rpsCore.gameOver();
                                    end = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}