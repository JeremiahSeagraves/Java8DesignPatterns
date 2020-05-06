package com.jeremiahseagraves.designpatterns.structural.bridge.advanced.printable;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Detail;
import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable.Formattable;

import java.util.List;

public interface Printable {

    default String print(Formattable formattable) {
        return formattable.format(getHeader(), getDetails());
    }

    List<Detail> getDetails();

    String getHeader();
}
