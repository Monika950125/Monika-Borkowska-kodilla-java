package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;

    public String getShapeName(){
        return "circle";
    }

    public double getField(){
        double area = Math.PI * Math.sqrt(radius);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
