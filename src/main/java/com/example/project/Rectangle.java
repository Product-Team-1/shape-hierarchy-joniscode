package com.example.project;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
