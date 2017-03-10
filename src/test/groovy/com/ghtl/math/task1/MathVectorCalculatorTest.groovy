package com.ghtl.math.task1

import com.ghtl.math.Point
import org.junit.Test

/**
 * Test class
 */
class MathVectorCalculatorTest {
    def calculator = new MathVectorCalculator()

    @Test
    public void 'get a point on a curve'() {
        Point p = calculator.getPoint(10)
        assert p != null
        assert p.x == 10
        assert p.y == 31.7333d
    }

    @Test
    public void 'get vector between two points'() {
        Point point0 = new Point(0, 0)
        Point point1 = calculator.getPoint(10)
        Point point2 = calculator.getPoint(20)

        //a = P0P1
        MathVector vectorP0P1 = calculator.getVector(point0, point1)
        //b = P0P2
        MathVector vectorP0P2 = calculator.getVector(point0, point2)

        assert vectorP0P1 != null
        assert vectorP0P2 != null

        assert vectorP0P1.x == 10
        assert vectorP0P1.y == 31.7333d

        assert vectorP0P2.x == 20
        assert vectorP0P2.y == 89.4818d
    }

    @Test
    public void 'get vector between two points (2)'() {
        Point point1 = calculator.getPoint(10)
        Point point2 = calculator.getPoint(20)

        //a = P1P2
        MathVector vectorP1P2 = calculator.getVector(point1, point2)

        assert vectorP1P2 != null

        assert vectorP1P2.x == 10
        assert vectorP1P2.y == 57.7485d
    }

    @Test
    public void 'test vector length'() {
        Point point0 = new Point(0, 0)

        Point point1 = calculator.getPoint(10)
        Point point2 = calculator.getPoint(20)

        //a = P0P1
        MathVector vectorP0P1 = calculator.getVector(point0, point1)
        //b = P0P2
        MathVector vectorP0P2 = calculator.getVector(point0, point2)

        def l = calculator.getLengthBetweenVectors(vectorP0P1, vectorP0P2)
        
        assert l == 3434.8893d
    }
}
