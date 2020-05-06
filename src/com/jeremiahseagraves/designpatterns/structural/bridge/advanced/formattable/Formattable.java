package com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Detail;

import java.util.List;

@FunctionalInterface
public interface Formattable {
    String format(String header, List<Detail> details);
}
