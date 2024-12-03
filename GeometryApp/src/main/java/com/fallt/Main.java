package com.fallt;

import com.fallt.shape.Circle;
import com.fallt.shape.Rectangle;
import com.fallt.shape.Shape;
import com.fallt.three_d_shape.Qube;
import com.fallt.three_d_shape.ThreeDimensionalShape;
import com.fallt.util.GeometryUtils;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(3.0);
        System.out.println("Area of circle: " + circle.calculateArea());
        Shape secondCircle = new Circle(4);
        Shape rectangle = new Rectangle(3.5, 4.5);
        System.out.println("Perimeter or rectangle: " + rectangle.calculatePerimeter());
        System.out.println(rectangle);
        ThreeDimensionalShape cube = new Qube(4);
        System.out.println(cube.calculateVolume());
        System.out.println(GeometryUtils.compareShape(secondCircle, circle));
        System.out.println(GeometryUtils.compareShape(circle, rectangle));
    }

}
