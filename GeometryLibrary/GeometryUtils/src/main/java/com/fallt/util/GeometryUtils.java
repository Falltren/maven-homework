package com.fallt.util;

import com.fallt.shape.Shape;

public class GeometryUtils {

    private GeometryUtils(){}

    public static int compareShape(Shape shape1, Shape shape2) {
        if (!shape1.getClass().getName().equals(shape2.getClass().getName())) {
            throw new ShapeTypeException("You can`t compare different shapes");
        }
        return Double.compare(shape1.calculateArea(), shape2.calculateArea());
    }

}
