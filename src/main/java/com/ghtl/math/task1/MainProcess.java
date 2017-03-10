package com.ghtl.math.task1;

import com.ghtl.math.Point;

/**
 * Main app
 */
public class MainProcess {
    public static void main(String[] args) {
        MathVectorCalculator ve = new MathVectorCalculator();
        Point point0 = new Point(0, 0);
        Point point1 = ve.getPoint(10);
        Point point2 = ve.getPoint(20);

        System.out.println("point0: " + point0);
        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

        //a = P0P1
        MathVector vectorP0P1 = ve.getVector(point0, point1);
        //b = P0P2
        MathVector vectorP0P2 = ve.getVector(point0, point2);

        System.out.println("vectorP0P1: " + vectorP0P1);
        System.out.println("vectorP0P2: " + vectorP0P2);

        System.out.println("Vector Length: " + ve.getLengthBetweenVectors(vectorP0P1, vectorP0P2));
    }
}
