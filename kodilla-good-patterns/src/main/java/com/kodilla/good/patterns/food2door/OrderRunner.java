package com.kodilla.good.patterns.food2door;

public class OrderRunner {
    public static void main(String[] args) {
        Supplier healthyShop = new HealthyShop();
        System.out.println(healthyShop.getName());
        healthyShop.putProductsInMap("pear",1200);
        Order order1 = new Order(healthyShop,"cucumber", 5);
        order1.executeOrder(order1);



        Supplier extraFoodShop = new ExtraFoodShop();
        extraFoodShop.putProductsInMap("fish", 1000);
        Order order2 = new Order(extraFoodShop, "fish", 3);
        order2.executeOrder(order2);


    }
}
