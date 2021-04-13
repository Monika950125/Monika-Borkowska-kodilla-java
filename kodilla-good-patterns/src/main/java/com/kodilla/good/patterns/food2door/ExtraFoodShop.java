package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier, ExecutionOfOrder {

    private String name;

    public ExtraFoodShop() {
        this.name = "ExtraFoodShop";
    }

    public String name() {
        return name;
    }

    public String process() {

        return "";
    }
}
