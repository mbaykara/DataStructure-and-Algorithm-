import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class SelectionTest {

	@Test
	public void testSelection() {
	    final Person miriam = new Person("Miriam", 12);
	    final Person gene = new Person("Gene", 95);
	    final Person agathe = new Person("Agathe", 28);
	    final Set<Person> persons = new HashSet<>(Arrays.asList(miriam, gene, agathe));
		final Set<Person> expected = new HashSet<>(Arrays.asList(gene, agathe));

		assertEquals(expected, Selection.selectOlder(persons, 25));
	}
	
}