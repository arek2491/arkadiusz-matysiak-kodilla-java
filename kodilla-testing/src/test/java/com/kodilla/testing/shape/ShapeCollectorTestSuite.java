package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Before
    public void beforeTest() {
        System.out.println("Test start");
    }
    @After
    public void afterTest() {
        System.out.println("Test completed");
    }
    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Cirqle cirqleFromClass = new Cirqle();
        shapeCollector.addFigure(cirqleFromClass);
        Shape cirqleFromShapeCollector = shapeCollector.getFigure(0);
        Assert.assertEquals(cirqleFromClass , cirqleFromShapeCollector);
    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Cirqle cirqleFromClass = new Cirqle();
        shapeCollector.addFigure(cirqleFromClass);
        shapeCollector.removeShape(cirqleFromClass);
        Assert.assertEquals(0, shapeCollector.showFigures().size());
    }
    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape cirqle = new Cirqle();
        shapeCollector.addFigure(cirqle);
        Shape getCirqle = shapeCollector.getFigure(0);
        Assert.assertEquals(cirqle, getCirqle);
    }
    @Test
    public void testShowFigures() {

        ShapeCollector shapeCollector = new ShapeCollector();
        Cirqle cirqle = new Cirqle();
        ArrayList<Shape> figureTest = new ArrayList<>();
        shapeCollector.addFigure(cirqle);
        figureTest.add(cirqle);
        ArrayList<Shape> showCirqleFromShapeCollector = shapeCollector.showFigures();
        Assert.assertEquals(figureTest, showCirqleFromShapeCollector);
    }

}
