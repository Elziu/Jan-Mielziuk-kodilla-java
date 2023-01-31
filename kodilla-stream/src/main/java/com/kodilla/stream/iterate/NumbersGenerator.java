package com.kodilla.stream.iterate;

import java.util.stream.*;

public class NumbersGenerator {

    public static void generateEvent(int max){
        Stream.iterate(1, n -> n + 1 )
                .limit(max)
                .filter(n -> n % 2 ==0)
                .forEach(System.out::println);
    }
}
