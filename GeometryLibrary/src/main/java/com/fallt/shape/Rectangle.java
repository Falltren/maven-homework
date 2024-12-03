package com.fallt.shape;

public class Rectangle extends Shape {

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        if (side1 <= 0 || side2 <= 0) {
            throw new IllegalArgumentException("The sides of a rectangle can`t be equal to or less then 0");
        }
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
