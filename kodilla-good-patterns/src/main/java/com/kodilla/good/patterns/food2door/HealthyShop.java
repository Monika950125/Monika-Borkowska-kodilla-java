package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Supplier, ExecutionOfOrder {

    private String name;

    public HealthyShop() {
        this.name = "HealthyShop";
    }

    public String name() {
        return name;
    }

    public String process() {
        return "";
    }


}
