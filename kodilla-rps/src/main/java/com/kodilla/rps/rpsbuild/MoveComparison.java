package com.kodilla.rps.rpsbuild;

public class MoveComparison extends  RpsCore{

    public String moveComparison(String playerChoice, String computerChoice){

        if(playerChoice.equals("1") && computerChoice.equals("1")){
            System.out.println(
                    "Your move: ROCK. \nComputer move: ROCK. \n "
            );
            return "draw";



        }
        if(playerChoice.equals("1") && computerChoice.equals("2")){
            System.out.println(
                    "Your move: ROCK. \nComputer move: PAPER. \n"
            );
            return "computer";



        }
        if(playerChoice.equals("1") && computerChoice.equals("3")){
            System.out.println(
                    "Your move: ROCK. \nComputer move: SCISSORS. \n"
            );
            return "player";



        }
        if(playerChoice.equals("2") && computerChoice.equals("1")){
            System.out.println(
                    "Your move: PAPER. \n Computer move: ROCK. \n "
            );
            return "player";



        }
        if(playerChoice.equals("2") && computerChoice.equals("2")){
            System.out.println(
                    "Your move: PAPER. \nComputer move: PAPER. \n"
            );
            return "draw";



        }
        if(playerChoice.equals("2") && computerChoice.equals("3")){
            System.out.println(
                    "Your move: PAPER. \nComputer move: SCISSORS. \n"
            );
            return "computer";



        }
        if(playerChoice.equals("3") && computerChoice.equals("1")){
            System.out.println(
                    "Your move: SCISSORS. \nComputer move: ROCK. \n "
            );
            return "computer";



        }
        if(playerChoice.equals("3") && computerChoice.equals("2")){
            System.out.println(
                    "Your move: SCISSORS. \nComputer move: PAPER. \n"
            );
            return "player";



        }
        if(playerChoice.equals("3") && computerChoice.equals("3")){
            System.out.println(
                    "Your move: SCISSORS.\nComputer move: SCISSORS.\n"
            );
            return "draw";



        }




        return "";




    }
}
