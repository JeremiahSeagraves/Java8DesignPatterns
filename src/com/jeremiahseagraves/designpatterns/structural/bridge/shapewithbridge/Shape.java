package com.jeremiahseagraves.designpatterns.structural.bridge.shapewithbridge;

/**
 * This uses composition to take the color in the constructor
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
