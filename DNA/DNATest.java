import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DNATest {


	@Test
	public void testValidDNA() {
		String input = "TCGAAATTGGC";

		assertTrue(DNA.indexOfFirstNoneDNABase(input) == -1);
	}
	
	@Test
	public void testInvalidDNA() {
		String input = "TCGaATC";

		assertTrue(DNA.indexOfFirstNoneDNABase(input) == 3);
	}
	
}