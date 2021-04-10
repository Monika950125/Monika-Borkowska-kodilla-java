package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
public class Display {

    public void displayValue(double value) {
        System.out.println(value);
    }
}
