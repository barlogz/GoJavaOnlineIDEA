package Tests;

import com.goit.gojavaonline.module4.distance.calculation.DistanceBetweenPoints;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.goit.gojavaonline.module4.distance.calculation.DistanceBetweenPoints.*;

public class DistanceBetweenPointsTest {

    @Before
    public void setUp() throws Exception {
        new DistanceBetweenPoints();

    }

    @Test
    public void testValueCalculateDistanceBetweenPoints() throws Exception {
        final double x1 = -2.3;
        final double x2 = 8.5;
        final double y1 = 4.0;
        final double y2 = 0.7;

        final double result = calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(11.293, result, 0.0001);

    }

    @Test
    public void testForIntegerValue() throws Exception {
        final int x1 = -2;
        final int x2 = 8;
        final int y1 = 4;
        final int y2 = 0;

        final double result = calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(10.771, result, 0.0001);

    }

    @Test
    public void testForHugeValue() throws Exception {
        final double x1 = -19999999999999999999999999999231231231231231231231211231231321321.3;
        final double x2 = 8.5;
        final double y1 = 4.0;
        final double y2 = 0.7;

        final double result = calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(2.0E64, result, 0.0001);

    }


}