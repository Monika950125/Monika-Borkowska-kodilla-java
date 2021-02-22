package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double triangleBase;
    private double height;

    public String getShapeName(){
        return "triangle";
    }

    public double getField(){
        double area = 0.5 * triangleBase * height;
        return area;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.triangleBase, triangleBase) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(triangleBase);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

