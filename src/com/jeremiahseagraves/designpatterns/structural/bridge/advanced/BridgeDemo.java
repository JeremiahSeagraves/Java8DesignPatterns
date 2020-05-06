package com.jeremiahseagraves.designpatterns.structural.bridge.advanced;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Movie;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable.Formattable;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable.HtmlFormattableImpl;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable.SimpleStringFormattableImpl;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.printable.MoviePrintableImpl;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.printable.Printable;

/**
 * The printable interface has a default method for print that utilizes a formatter
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formattable printFormattable = new SimpleStringFormattableImpl();
        Printable moviePrinter = new MoviePrintableImpl(movie);

        String printedMaterial = moviePrinter.print(printFormattable);

        System.out.println(printedMaterial);

        Formattable htmlFormattable = new HtmlFormattableImpl();

        String htmlMaterial = moviePrinter.print(htmlFormattable);

        System.out.println(htmlMaterial);
    }

}
