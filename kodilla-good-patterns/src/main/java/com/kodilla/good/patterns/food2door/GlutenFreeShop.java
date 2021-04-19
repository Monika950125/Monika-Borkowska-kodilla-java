package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private String name;
    private final Map<String, Integer> depotOfGlutenFreeShop = new HashMap<>();

    public GlutenFreeShop() {
        this.name = "Gluten Free Shop";
    }

    public Map<String, Integer> putProductsInMap(String product, Integer quantityOfProducts) {
        depotOfGlutenFreeShop.put("apple", 1000);
        depotOfGlutenFreeShop.put("pear", 1000);
        depotOfGlutenFreeShop.put("banana", 1000);
        depotOfGlutenFreeShop.put(product, quantityOfProducts);
        return depotOfGlutenFreeShop;
    }

    public void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = depotOfGlutenFreeShop.get(product) - quantityOfProducts;
        depotOfGlutenFreeShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        updateDepotStatus(order.getTypeOfProduct(), order.getQuantity());
        System.out.println("You chose the GlutenShop");
        System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
        System.out.println("The order has been transferred for execution");
        System.out.println("Thank you and come back again");
    }
}
