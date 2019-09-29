import static org.junit.Assert.*;

import org.junit.Test;

public class FilterTest {

    private static final double MAX_DEVIATION = 0.0001;
    
    @Test
    public void testMean() {
        final Person[] elements = {new Person("Herbert", 27, 52), 
                                   new Person("Frida", 43, 44), 
                                   new Person("Margon", 71, 83)};
        final Condition<Person> isYoungerThan50 = Person.isYoungerThan(50);
        final Value<Person> getWeight = Person.getWeight();
        double expected = 48.0;
        assertEquals("Der berechnete Durchschnitt ist falsch.", expected, 
                       Filter.mean(elements, isYoungerThan50, getWeight),
                                                          MAX_DEVIATION);
    }
    
}
