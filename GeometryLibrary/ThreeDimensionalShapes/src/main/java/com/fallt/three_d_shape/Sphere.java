package com.fallt.three_d_shape;

public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius cant`t be equal to or less then 0");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return 4. / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }

}
