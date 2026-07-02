package com.example.project;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = Math.max(0, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
