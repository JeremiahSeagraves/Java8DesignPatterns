package com.jeremiahseagraves.designpatterns.creational.builder;

public class LunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    LunchOrder(LunchOrderBuilder builder) {
        this.bread = builder.getBread();
        this.condiments = builder.getCondiments();
        this.dressing = builder.getDressing();
        this.meat = builder.getMeat();
    }

    String getBread() {
        return bread;
    }

    String getCondiments() {
        return condiments;
    }

    String getDressing() {
        return dressing;
    }

    String getMeat() {
        return meat;
    }

}
