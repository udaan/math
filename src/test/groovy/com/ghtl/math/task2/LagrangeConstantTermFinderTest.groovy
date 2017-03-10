package com.ghtl.math.task2

import com.ghtl.math.Point
import org.junit.Test

/**
 * Test Class
 */
class LagrangeConstantTermFinderTest {

    def finder = new LagrangeConstantTermFinder()

    @Test
    public void 'test constant term'() {
        Point p1 = new Point(1, 1494)
        Point p2 = new Point(2, 2329)
        Point p3 = new Point(3, 3965)

        Point[] points = [p1, p2, p3]

        def constantTerm = finder.getConstantTerm(points, 0, 7)

        assert constantTerm == 2d
    }
}
