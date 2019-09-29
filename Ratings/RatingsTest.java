import static org.junit.Assert.*;

import org.junit.Test;

public class RatingsTest {

    private static final double MAX_DEVIATION = 0.0001;
    
    @Test
    public void testRatings1() {
        int[] ratingCounts = {3,5,3};
        double expected = 1.0;
        assertEquals("Der berechnete Durchschnitt ist falsch.", expected, 
                  Ratings.mean(ratingCounts), MAX_DEVIATION);
    }

    @Test
    public void testRatings2() {
        int[] ratingCounts = {2,10,10,12,11,5};
        double expected = 2.7;
        assertEquals("Der berechnete Durchschnitt ist falsch.", expected, 
                  Ratings.mean(ratingCounts), MAX_DEVIATION);
    }
    
}
