package org.example.patterns.interview.book_my_show.controller;


import org.example.patterns.interview.book_my_show.entities.Movie;
import org.example.patterns.interview.book_my_show.entities.Show;
import org.example.patterns.interview.book_my_show.entities.Theatre;
import org.example.patterns.interview.book_my_show.enums.City;
import org.example.patterns.interview.book_my_show.service.TheatreService;

import java.time.LocalDate;
import java.util.*;

public class TheatreController {

    private final TheatreService theatreService;

    public TheatreController() {
        this.theatreService = new TheatreService();
    }

    public void addTheatre(Theatre theatre) {
        theatreService.addTheatre(theatre);
    }

    public Set<Movie> getMovies(City city, LocalDate date) {
        return theatreService.getMovies(city, date);
    }

    public List<Theatre> getTheatres(City city, Movie movie, LocalDate date) {
        return theatreService.getTheatres(city, movie, date);
    }

    public List<Show> getShows(Movie movie, LocalDate date, Theatre theatre) {
        return theatreService.getShows(movie, date, theatre);
    }
}
