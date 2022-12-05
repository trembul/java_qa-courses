package firstchapter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point p1 = new Point(7, 8);
        Point p2 = new Point(4, 4);
        Assert.assertEquals(Point.distance(p1,p2), 5.0,
                "The distance is incorrect");
    }

    @Test
    public void testDistanceGreater(){
        Point p1 = new Point( 0, 0);
        Point p2 = new Point(8, 6);
        double result = 10;
        Assert.assertTrue(Point.distance(p1,p2) > result,
                "The distance is not greater than ");
    }

//this test doesn't check distance itself but attributes of Points
    @Test
    public void testPointHigher(){
        Point p1 = new Point(2 , 8);
        Point p2 = new Point(1, 8);
        Assert.assertTrue(p1.y> p2.y,
                "Point p1 is not higher than point p2");
    }
}
