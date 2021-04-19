package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private final String name;
    private final Map<String, Integer> depotOfHealthyShop = new HashMap<>();

    public HealthyShop() {
        this.name = "Healthy Shop";
    }

    public Map<String, Integer> putProductsInMap(String product, Integer quantityOfProducts) {
        depotOfHealthyShop.put("tomato", 1000);
        depotOfHealthyShop.put("cucumber", 1500);
        depotOfHealthyShop.put("radish", 4200);
        depotOfHealthyShop.put(product, quantityOfProducts);
        return depotOfHealthyShop;
    }

    public void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = depotOfHealthyShop.get(product) - quantityOfProducts;
        depotOfHealthyShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        updateDepotStatus(order.getTypeOfProduct(), order.getQuantity());
        System.out.println("You chose the HealthyShop");
        System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
        System.out.println("The order has been transferred for execution");
        System.out.println("Thank you for using our services");
    }
}
