package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Supplier {

    String getName();

    void updateDepotStatus(String product, Integer quantityOfProducts);

    Map<String, Integer> putProductsInMap(String product, Integer quantityOfProducts);

    void process(Order order);

}
