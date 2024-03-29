package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private String name;
    private final Map<String, Integer> depotOfGlutenFreeShop = new HashMap<>();

    public GlutenFreeShop() {
        this.name = "Gluten Free Shop";
        putProductsInMap();
    }

    private void putProductsInMap() {
        depotOfGlutenFreeShop.put("apple", 3);
        depotOfGlutenFreeShop.put("pear", 1000);
        depotOfGlutenFreeShop.put("banana", 1000);
    }

    private void updateDepotStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = depotOfGlutenFreeShop.get(product) - quantityOfProducts;
        depotOfGlutenFreeShop.put(product, depotStatus);
    }

    public String getName() {
        return name;
    }

    public void process(Order order) {
        if (depotOfGlutenFreeShop.containsKey(order.getTypeOfProduct()) && depotOfGlutenFreeShop.get(order.getTypeOfProduct()) >= order.getQuantity()) {
            updateDepotStatus(order.getTypeOfProduct(), order.getQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you for using the services \"Gluten Free Shop\"");
        } else {
            System.out.println("The selected product is not available.");
        }
    }
}
