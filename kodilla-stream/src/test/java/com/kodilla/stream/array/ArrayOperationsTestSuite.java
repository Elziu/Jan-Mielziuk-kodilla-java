package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        int[] testNumbers = {52, 3, 23, 23, 52, 93, 6, 34, 3, 23, 2, 32, 48, 53, 63, 4, 16, 2, 32, 52};

        //When
        double expectedAverage = 30.8;

        //Then
        Assertions.assertEquals(expectedAverage, ArrayOperations.getAverage(testNumbers).getAsDouble());


    }
}
