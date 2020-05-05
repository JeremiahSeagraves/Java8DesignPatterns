package com.jeremiahseagraves.designpatterns.creational.builder;

/**
 * @author jeremiah.seagraves
 * @created 5/4/2020
 */
public class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder() {

    }

    public LunchOrder build() {
        return new LunchOrder(this);
    }

    public LunchOrderBuilder bread(String bread) {
        this.bread = bread;
        return this;
    }

    public LunchOrderBuilder condiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LunchOrderBuilder dressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LunchOrderBuilder meat(String meat) {
        this.meat = meat;
        return this;
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
