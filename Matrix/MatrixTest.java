import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixTest {

    @Test
    public void testTranspose() {
        int[][] m = {{3,3,3},{2,2,2},{1,1,1}};
        int[][] exp = {{3,2,1},{3,2,1},{3,2,1}};
        assertArrayEquals("Die zurückgegebene Matrix ist falsch.", exp, Matrix.transposeMatrix(m));
    }

     @Test
    public void testTranspose2() {
        int[][] m = {{3,3,3,3},{2,2,2,2},{1,1,1,1}};
        int[][] exp = {{3,2,1},{3,2,1},{3,2,1},{3,2,1}};
        assertArrayEquals("Die zurückgegebene Matrix ist falsch.", exp, Matrix.transposeMatrix(m));
    }
}

