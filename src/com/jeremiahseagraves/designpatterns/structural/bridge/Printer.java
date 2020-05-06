package com.jeremiahseagraves.designpatterns.structural.bridge;

import java.util.List;

/**
 * This is the equivalent component of Shape in the shape with bridge example
 * Meaning that we can create any custom implementation of printer (shape) passing the formatter (color) to the print ()
 * or (as a change) having a field of Formattable in the Printer class
 */
public abstract class Printer {

    private Formatter formatter;

    public Printer(Formatter formatter) {
        this.formatter = formatter;
    }

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    public String print() {
        return this.formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
