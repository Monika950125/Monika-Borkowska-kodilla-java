package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private final String name;
    private final Map<String, Integer> depotOfHealthyShop = new HashMap<>();

    public HealthyShop() {
        this.name = "HealthyShop";
    }

    public Map<String, Integer> putProducts() {
        depotOfHealthyShop.put("tomato", 1000);
        depotOfHealthyShop.put("cucumber", 1500);
        depotOfHealthyShop.put("radish", 4200);
        return depotOfHealthyShop;
    }

    public void updateDepotStatus(String vegetable, Integer quantityOfProducts) {
        Integer depotStatus = depotOfHealthyShop.get(vegetable) - quantityOfProducts;
        depotOfHealthyShop.put(vegetable, depotStatus);
    }

    public String name() {
        return name;
    }

    public String process(Order order) {
        return "";
    }


}
