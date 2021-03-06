package com.kodilla.exception.test;

public class FirstChallenge {

    double a;
    double b;

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;

    }
}
