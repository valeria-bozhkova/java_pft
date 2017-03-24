package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 3/23/2017.
 */
public class PointTests {

    @Test
    //Verify standard distance
    public void testDistance() {
      Point p1 = new Point(1,8);
      Point p2 = new Point(4,12);

      Assert.assertEquals(p1.distance(p2), 5.0);
    }

    @Test
    //Verify zero distance
    public void testZeroDistance() {
      Point p1 = new Point(0,0);
      Point p2 = new Point(0,0);

     Assert.assertTrue(p1.distance(p2) ==  0);
    }

    @Test
    //Verify rounded distance
    public void testRoundedDistance() {
      Point p1 = new Point(1,8);
      Point p2 = new Point(12,12);

      Assert.assertEquals(Math.round(p1.distance(p2)), 12);
    }

}
