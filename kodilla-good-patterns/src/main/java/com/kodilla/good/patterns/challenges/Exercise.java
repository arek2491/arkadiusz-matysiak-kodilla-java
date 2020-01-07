package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Exercise {

    private MovieStore movieStore;
    private Character EXCLAMATION_MARK;

    public Exercise() {
        movieStore = new MovieStore();
        EXCLAMATION_MARK = '!';
    }

    public String allTitlesWithExclamationMark() {
        return movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(result -> result + EXCLAMATION_MARK)
                .collect(Collectors.joining());
    }
}
