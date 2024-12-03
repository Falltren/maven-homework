package com.fallt.three_d_shape;

public class Qube extends ThreeDimensionalShape {

    private final double side;

    public Qube(double side) {
        if (side <= 0){
            throw new IllegalArgumentException("The sides of a qube can`t be equal to or less then 0");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Qube{" +
                "side=" + side +
                '}';
    }

}
