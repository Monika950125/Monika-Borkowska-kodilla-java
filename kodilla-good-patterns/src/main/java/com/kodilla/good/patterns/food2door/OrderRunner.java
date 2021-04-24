package com.kodilla.good.patterns.food2door;

public class OrderRunner {
    public static void main(String[] args) {

        Order order1 = new Order("cucumber", 5, 458962);
        Order order2 = new Order("fish", 3,256942);
        Order order3 = new Order("apple", 6,258952);

        SupplierRetriever supplierRetriever = new SupplierRetriever();
        supplierRetriever.process(order1);
        supplierRetriever.process(order2);
        supplierRetriever.process(order3);
    }
}
