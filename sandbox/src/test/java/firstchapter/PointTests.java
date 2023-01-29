package firstchapter;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTests {

    @Test
    public void testDistance(){
        Point p1 = new Point(7, 8);
        Point p2 = new Point(4, 4);
        Assert.assertEquals(p1.distance(p2), 5.0, "The distance is incorrect");
        Assert.assertTrue(p1.distance(p2) == p2.distance(p1));
        Assert.assertNotNull(p1);
        Assert.assertNotNull(p2);
    }
}
