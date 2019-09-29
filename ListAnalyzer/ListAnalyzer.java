import java.util.List;

/**
 * AUFGABE
 * ListAnalyzer (10 Punkte)
 * Implementieren Sie die Methode calcAverage gemäß ihres Javadoc-Kommentares.
 * 
 * Der Durchschnitt wird berechnet aus der Summe aller Zahlen geteilt durch
 * die Anzahl der Zahlen.
 * 
 * Beispiel:
 * Gegeben die Listen {1,3,5}, {4,2}, {2,3,4,9,7}. 
 * Dann ist der Durchschnitt 1+3+5+4+2+2+3+4+9+7=40. Es sind insgesamt 10 Werte, also
 * ist der Durchschnitt 40/10=4.
 */
public final class ListAnalyzer {

    /**
     * Gibt den Durchschnitt aller Zahlen in der gegebenen Liste von Listen
     * zurück. Falls mind. eine der Listen {@code null} ist, wird eine
     * {@link IllegalArgumentException} ausgelöst.
     *
     * Ein möglicher Überlauf bei der Berechnung der Summe wird hier nicht
     * beachtet, d. h. wenn die Summe größer als {@link Integer#MAX_VALUE} ist,
     * dann ist der Rückgabewert evtl. nicht korrekt.
     *
     * @param list die Liste von Listen von ganzen Zahlen, deren gerade Zahlen
     * aufsummiert werden sollen
     * @return die Summe der geraden Zahlen in der gegebenen Liste von Listen
     */
    public static double calcAverage(final List<List<Integer>> lists) {

        if(lists.contains(null)) throw new IllegalArgumentException();
        double sum =0;
        for(int i = 0; i < lists.size(); i++){
            for(int j =0; j < lists.get(i).size(); j++){
            
                if (lists.get(i).get(j) % 2 == 0) sum +=lists.get(i).get(j);
            }
        
        }
        return sum/lists.size();
    }

}
