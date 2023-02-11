package com.kodilla.rps.rpsbuild;

import java.util.Random;

public class ComputerMove {

    public static int computerMove() {
        Random random = new Random();

        return random.nextInt(3)+1;
    }
}
