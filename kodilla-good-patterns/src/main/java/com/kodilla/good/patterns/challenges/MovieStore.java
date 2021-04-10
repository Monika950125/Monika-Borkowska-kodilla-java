package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    private final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public String showMovieTitles() {
        Map<String, List<String>> titles = getMovies();
        String movieTitles = titles.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("! ", "", ""));
        return movieTitles;
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.showMovieTitles());
    }
}


