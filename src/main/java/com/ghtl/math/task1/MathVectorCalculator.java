package com.ghtl.math.task1;

import com.ghtl.math.Point;
import com.ghtl.math.Util;

/**
 * Calculator for Vector
 */
public class MathVectorCalculator {

    public static final int DECIMAL_PLACES = 4;

    /*
    Find point on the curve
    */
    public Point getPoint(int x) {
        int multiplier = x < 0 ? -1 : 1;
        x = Math.abs(x);
        return new Point(multiplier * x, Util.round(multiplier * Math.sqrt((x * x * x) + 7), DECIMAL_PLACES));
    }

    /*
    Get vector from one point to another
     */
    public MathVector getVector(Point fromPoint, Point toPoint) {
        double x = Util.round(toPoint.getX() - fromPoint.getX(), DECIMAL_PLACES);
        double y = Util.round(toPoint.getY() - fromPoint.getY(), DECIMAL_PLACES);

        return new MathVector(x, y);
    }

    /*
    Get length between different vectors
     */
    public double getLengthBetweenVectors(MathVector a, MathVector b) {
        double resultX = b.getX() - a.getX();
        double resultY = b.getY() - a.getY();

        return Util.round(((resultX * resultX) + (resultY * resultY)), DECIMAL_PLACES);
    }
}