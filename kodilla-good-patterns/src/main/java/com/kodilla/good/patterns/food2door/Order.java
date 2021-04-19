package com.kodilla.good.patterns.food2door;

public class Order {

    private final Supplier supplier;
    private final int quantity;
    private final String typeOfProduct;


    public Order(Supplier supplier, String typeOfProduct, int quantity) {
        this.supplier = supplier;
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void executeOrder(Order order){
          supplier.process(order);
    }
}
