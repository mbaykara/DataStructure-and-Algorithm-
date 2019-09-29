/**
 * AUFGABE 1
 * Matrix (10 Punkte)
 * Implementieren Sie die Methode transposeMatrix gemäß des Javadoc-Kommentares.
 * 
 * Für ein Beispiel in die TestKlasse schauen oder in die README des Projektes.
 *  
 */
public class Matrix {

    /**
     * Spiegelt die gegebene Matrix an der Hauptdiagonalen (d. h.
     * tauscht Zeilen und Spalten) und gibt die gespiegelte
     * Matrix zurück. Die gegebene Matrix muss nicht quadratisch aber
     * rechteckig sein (d. h. alle Zeilen sind gleich lang).
     * 
     * @param matrix die zu spiegelnde Matrix (muss nicht quadratisch sein)
     * @return die gespiegelte Matrix
     * @throws IllegalArgumentException falls die gegebene Matrix keine rechteckige Matrix ist
     * oder der Parameter den Wert {@code null} hat
     */
    public static int[][] transposeMatrix(final int[][] matrix) {
        int[][] quatrix = new int[matrix[0].length][matrix.length];
        
        for(int i = 0; i < matrix.length; i++){
        
            for(int j = 0; j < matrix[i].length; j++){
                quatrix[j][i] = matrix[i][j];
            }
        }
        return quatrix;
    }

}