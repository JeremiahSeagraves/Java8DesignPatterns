package com.jeremiah.designpatterns.creational.builder.usual;

/**
 * This is the usual way, having getters and setters
 * This way, there is no contract way of which properties are required, which are not, and we can't force any field to be
 * non-null and so no guarantees exists of any instance having any field set.
 */
public class LunchOrderBeanDemo {

    public static void main(String args[]) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }

}
