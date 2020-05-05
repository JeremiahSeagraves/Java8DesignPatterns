package com.jeremiahseagraves.designpatterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		ItemRegistry itemRegistry = new ItemRegistry();
		Movie movie = (Movie) itemRegistry.createItem("Movie");//this will give us an instance of movie by cloning the default inside the itemRegistry
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie = (Movie) itemRegistry.createItem("Movie");//another unique instance by using the same clone inside the itemRegistry
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
	}

}
