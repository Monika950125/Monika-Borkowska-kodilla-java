package com.kodilla.good.patterns.food2door;

public interface ExecutionOfOrder {

    String process();

    default boolean isExecute(){
        boolean information;
        information = "The order has been completed".equals(process());
        return information;
    }
}
