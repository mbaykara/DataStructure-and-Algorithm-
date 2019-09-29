import static org.junit.Assert.*;

import org.junit.Test;

public class ChessTest {

	@Test
	public void testGenerateRect() {
		String expected = "#-#-#\n-#-#-\n#-#-#\n-#-#-\n";

		assertEquals(expected, Chess.generateRect(4,5));
	}
}