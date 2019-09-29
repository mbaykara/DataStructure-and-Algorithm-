import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class PointsTest {

    private Points points;
    
    @Before
    public void init() {
        points = new Points();
    }
    
    @Test
    public void test001() {
        final List<Integer> values = Arrays.asList(
            4, 6, 2,
            9, 6, 3,
            20, 10, 10);
        final List<Points.Point2D> result =
                points.points(values.iterator());
        
        assertNotNull("Ergebnis ist null", result);
        assertEquals(3, result.size());
        assertEquals(2, result.get(0).getX());
        assertEquals(3, result.get(0).getY());
        assertEquals(3, result.get(1).getX());
        assertEquals(2, result.get(1).getY());
        assertEquals(2, result.get(2).getX());
        assertEquals(1, result.get(2).getY());
    }
}
