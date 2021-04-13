package com.kodilla.good.patterns.food2door;

public class Order {

    private final Supplier supplier;
    private final String productType;
    private final int productQuantity;

    public Order(Supplier supplier, String productType, int productQuantity) {
        this.supplier = supplier;
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

}
