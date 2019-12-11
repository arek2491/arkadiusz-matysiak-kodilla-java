package com.kodilla.testing.shape;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public int getField() {
        return 2;
    }
}
