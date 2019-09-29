import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListAnalyzerTest {

    @Test
    public void standardTest() {
        Integer[] a1 = {1,3,5};
        Integer[] a2 = {4,2};
        Integer[] a3 = {2,3,4,9,7};
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(a1));
        lists.add(Arrays.asList(a2));
        lists.add(Arrays.asList(a3));

        assertEquals(4, ListAnalyzer.calcAverage(lists), 0.0001);
    }
@Test
    public void standardTest2() {
        Integer[] a1 = {1,3,5,5,7,8};
        Integer[] a2 = {4,2,8};
        Integer[] a3 = {2,3,4,9,7,12};
        Integer[] a4 = {2,6};
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(a1));
        lists.add(Arrays.asList(a2));
        lists.add(Arrays.asList(a3));
        lists.add(Arrays.asList(a4));


        assertEquals(12, ListAnalyzer.calcAverage(lists), 0.0001);
    }
    

    
}