package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    List<Shape> collector = new ArrayList<>();

    public Integer getSize() {
        return collector.size();
    }

    public List<Shape> addFigure(Shape shape) {

        collector.add(shape);
        return collector;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (collector.contains(shape)) {
            collector.remove(shape);
            result = true;
        }
        return result;
    }


    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n >= 0 && n < collector.size()) {
            theShape = collector.get(n);
        }
        return theShape;
    }


    public String showFigures() {
        String result = "";
        for (Shape shapeName : collector) {
            result = result + shapeName.getShapeName();
        }
        return result;
    }
}





