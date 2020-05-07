package com.jeremiahseagraves.designpatterns.structural.bridge;

/**
 * The printer are composed of formatter and any other fields (in the case of a MoviePrintableImpl, Movie)
 * We can create any new kind of class (Book, Employee, Forecast, XYZ) and create a new printer of that kind and that's it
 * The class detail is just a connection between the media objects and the printers
 */
public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(printFormatter, movie);//applying a default formatter
		
		String printedMaterial = moviePrinter.print();//using the default formatter
		
		System.out.println(printedMaterial);
		
		Formatter htmlFormatter = new HtmlFormatter();

		String htmlMaterial = moviePrinter.print(htmlFormatter);//using a different formatter
		
		System.out.println(htmlMaterial);
	}

}
