import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommonCharactersTest {

    @Test
    public void standardTest() {
        String result = CommonCharacters.getCommonCharacters("baac", "fdeabac");
        assertEquals(3, result.length());
        assertTrue(result.contains("a")); 
        assertTrue(result.contains("b")); 
        assertTrue(result.contains("c")); 
    }
    
    
      @Test
    public void secondTest() {
        String result = CommonCharacters.getCommonCharacters("mehmetali", "baykaram");
        assertEquals(2, result.length());
        assertTrue(result.contains("a")); 
        assertTrue(result.contains("m")); 

    }

}
