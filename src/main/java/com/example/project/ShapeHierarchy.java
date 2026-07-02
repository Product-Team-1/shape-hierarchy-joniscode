package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Triangle(6, 4));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
