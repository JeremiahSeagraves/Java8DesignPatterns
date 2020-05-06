package com.jeremiahseagraves.designpatterns.structural.bridge.advanced.printable;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Detail;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Movie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviePrintableImpl implements Printable {

    private Movie movie;

    public MoviePrintableImpl(Movie movie) {
        this.movie = movie;
    }

    @Override
    public List<Detail> getDetails() {
        return Stream.of(
                new Detail("Title", movie.getTitle()),
                new Detail("Year", movie.getYear()),
                new Detail("Runtime", movie.getRuntime())).collect(Collectors.toList());
    }

    @Override
    public String getHeader() {
        return movie.getClassification();
    }

}
