package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Supplier, ExecutionOfOrder {

    private String name;

    public GlutenFreeShop() {
        this.name = "GlutenFreeShop";
    }

    public String name() {
        return name;
    }

    public String process() {
        return "";
    }
}
