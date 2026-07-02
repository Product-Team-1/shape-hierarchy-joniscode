package com.example.project;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = Math.max(0, base);
        this.height = Math.max(0, height);
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
