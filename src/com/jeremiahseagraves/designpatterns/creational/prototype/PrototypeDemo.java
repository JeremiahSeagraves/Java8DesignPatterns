package com.jeremiahseagraves.designpatterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Long beforeTime = System.currentTimeMillis();
        ItemRegistry itemRegistry = new ItemRegistry();//only this will take some time
        Long afterTime = System.currentTimeMillis();
        System.out.println(afterTime - beforeTime);

        beforeTime = System.currentTimeMillis();
        Movie movie = (Movie) itemRegistry.createItem("Movie");//this will give us an instance of movie by cloning the default inside the itemRegistry
        // and it will take near or equal 0ms
        afterTime = System.currentTimeMillis();
        System.out.println(afterTime - beforeTime);

        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        beforeTime = System.currentTimeMillis();
        Movie anotherMovie = (Movie) itemRegistry.createItem("Movie");//another unique instance by using the same clone inside the itemRegistry
        //it will also take near or equal 0ms
        afterTime = System.currentTimeMillis();
        System.out.println(afterTime - beforeTime);

        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }

}
