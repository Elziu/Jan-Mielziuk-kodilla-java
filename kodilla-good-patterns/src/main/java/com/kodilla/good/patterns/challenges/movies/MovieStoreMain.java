package com.kodilla.good.patterns.challenges.movies;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movies);
    }
}