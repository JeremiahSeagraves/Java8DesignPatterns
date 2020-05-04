package com.jeremiah.designpatterns.creational.builder;

/**
 * Here we are applying the builder pattern, having no setters and having one method per attribute, returning the instance
 * of the class in each one, making the construction of any instance variate.
 */
public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        LunchOrderBuilder builder = new LunchOrderBuilder();

        builder.bread("Wheat").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
