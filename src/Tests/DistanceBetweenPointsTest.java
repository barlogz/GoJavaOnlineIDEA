package Tests;

import com.goit.gojavaonline.module4.distance.calculation.DistanceBetweenPoints;
import org.junit.Assert;
import org.junit.Test;

public class DistanceBetweenPointsTest {

    @Test
    public void testValueCalculateDistanceBetweenPoints() throws Exception {
        final double x1 = -2.3;
        final double x2 = 8.5;
        final double y1 = 4.0;
        final double y2 = 0.7;

        DistanceBetweenPoints distanceBetweenPoints = new DistanceBetweenPoints();
        final double result = distanceBetweenPoints.calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(11.293, result, 0.0001);

    }

    @Test
    public void testForIntegerValue() throws Exception {
        final int x1 = -2;
        final int x2 = 8;
        final int y1 = 4;
        final int y2 = 0;

        DistanceBetweenPoints distanceBetweenPoints = new DistanceBetweenPoints();
        final double result = distanceBetweenPoints.calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(10.771, result, 0.0001);

    }

    @Test
    public void testForHugeValue() throws Exception {
        final double x1 = -1231231231231231231231211231231321321.3;
        final double x2 = 8.5;
        final double y1 = 4.0;
        final double y2 = 0.7;

        DistanceBetweenPoints distanceBetweenPoints = new DistanceBetweenPoints();
        final double result = distanceBetweenPoints.calculateDistanceBetweenPoints(x1, x2, y1, y2);

        System.out.println(result);

        Assert.assertEquals(1.2312312312312312E36, result, 0.0001);

    }


}