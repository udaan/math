package com.ghtl.math.task1;

/**
 * Domain class to hold Vector data
 */
public class MathVector {
    private double x;
    private double y;

    public MathVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MathVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
