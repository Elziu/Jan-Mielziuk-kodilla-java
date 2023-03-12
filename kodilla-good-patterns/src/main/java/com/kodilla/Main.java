package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movies);
    }
}