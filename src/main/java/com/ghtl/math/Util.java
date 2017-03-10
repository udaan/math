package com.ghtl.math;

/**
 * Math Util
 */
public class Util {

    /*
    Round till n decimal places
     */
    public static double round(double d, int n) {
        return (double) Math.round(d * 10000d) / 10000d;
    }
}
