import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BeautifulNumbersTest {

    @Test
    public void standardTest() {
        assertTrue(BeautifulNumbers.isPerfectNumber(6));
        assertFalse(BeautifulNumbers.isPerfectNumber(4));
    }

}
