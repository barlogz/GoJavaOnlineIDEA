package Tests;

import com.goit.gojavaonline.module4.square.calculation.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareCalculationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testRectangleSquareCalculation() throws Exception {
        Rectangle rectangle = new Rectangle(1.5, 2.12);

        final double result = rectangle.square();
        System.out.println(result);

        Assert.assertEquals(3.18, result, 0.001);
    }

    @Test
    public void testCircleSquareCalculation() throws Exception {
        Circle circle = new Circle(1.5);

        final double result = circle.square();
        System.out.println(result);

        Assert.assertEquals(7.068583, result, 0.000001);
    }

    @Test
    public void testTriangleSquareCalculation() throws Exception {
        Triangle triangle = new Triangle(1.5, 2.5, 3.4);

        final double result = triangle.square();
        System.out.println(result);

        Assert.assertEquals(1.711841, result, 0.000001);
    }
}