package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures;

    public ShapeCollector() {

        figures = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public void removeFigure(Shape shape){
        figures.remove(shape);
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public ArrayList<Shape> showFigures() {

        return figures;
    }

    public boolean removeShape(Shape shape) {

        return true;
    }

    public int figuresSize() {

        return figures.size();
    }


}
