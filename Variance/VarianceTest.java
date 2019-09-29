import static org.junit.Assert.*;

import org.junit.Test;

public class VarianceTest {

    private static final double MAX_DEVIATION = 0.0001;
    
    @Test
    public void testVariance1() {
        double[] values = {2,3,4,3};
        double expected = 0.5;
        assertEquals("Die berechnete Varianz ist falsch.", expected, 
                Variance.variance(values), MAX_DEVIATION);
    }

    @Test
    public void testVariance2() {
        double[] values = {7,5,1,6,5};
        double expected = 4.16;
        assertEquals("Die berechnete Varianz ist falsch.", expected, 
                Variance.variance(values), MAX_DEVIATION);
    }
    
    /**
     * Die Methode mean ist optional, ihr Test ist daher nicht bewertungsrelevant.
     */
    @Test
    public void testMean1() {
        double[] values = {2,3,4};
        double expected = 3.0;
        assertEquals("Der berechnete Durchschnitt ist falsch. " +
                "[NICHT BEWERTUNGSRELEVANT, da Methode mean optional ist]", 
                expected, Variance.mean(values), MAX_DEVIATION);
    }
    
    /**
     * Die Methode mean ist optional, ihr Test ist daher nicht bewertungsrelevant.
     */
    @Test
    public void testMean2() {
        double[] values = {7,5,1,6,5};
        double expected = 4.8;
        assertEquals("Der berechnete Durchschnitt ist falsch. " + 
                "[NICHT BEWERTUNGSRELEVANT, da Methode mean optional ist]", 
                expected, Variance.mean(values), MAX_DEVIATION);
    }
    
}
