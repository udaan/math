package com.ghtl.math.task2;

import com.ghtl.math.Point;
import com.ghtl.math.Util;

/**
 * Provides functionality to find constant term of Lagrange interpolation.
 */
public class LagrangeConstantTermFinder {
    public static final int DECIMAL_PLACES = 4;

    public double getConstantTerm(Point[] points, int term, int p) {

        double dividend = 1, divisor = 1;

        for (int i = 0; i < points.length; i++) {

            if(i != term) {
                dividend *= -1;
                dividend *= points[i].getX();

                divisor *= (points[term].getX() - points[i].getX());
            }
        }

        double result = (divisor != 0) ? dividend / divisor : 0;

        result *= points[term].getY();

        result %= p;

        return Util.round(result, DECIMAL_PLACES);
    }
}
