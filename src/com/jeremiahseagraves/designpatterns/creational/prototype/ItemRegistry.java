package com.jeremiahseagraves.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This registry is the most important part of the prototype patterns, as it holds the default instances of every class that we want to prototype
 */
public class ItemRegistry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public ItemRegistry() {
    	//this is the functionality that will load the default object instances
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }
}
