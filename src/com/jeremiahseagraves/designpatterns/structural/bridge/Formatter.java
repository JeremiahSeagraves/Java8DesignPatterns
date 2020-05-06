package com.jeremiahseagraves.designpatterns.structural.bridge;

import java.util.List;

/**
 *This is the equivalent to color in the shape with bridge example
 * Meaning that we can create any custom formatter (or custom colors) and implement the custom format (applyColor) methods
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
