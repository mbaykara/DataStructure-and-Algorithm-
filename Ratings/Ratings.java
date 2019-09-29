import java.util.NoSuchElementException;

/**
 * AUFGABE Ratings (10 Punkte)
 *
 * Implementieren Sie die Methode mean gemäß des Javadoc-Kommentares.
 */
public class Ratings {

    /**
     * Berechnet den Durchschnitt abgegebener Bewertungen.
     * 
     * Die Bewertungen liegen vor als Array der Anzahlen von Werten
     * (also als Histogramm). Dabei steht die Häufigkeit der Bewertung 
     * i am Index i.
     * 
     * Z. B. ist ratingCounts[3] also die Anzahl, wie oft die 
     * Bewertung 3 gewählt wurde.
     * 
     * @param ratingCounts
     *          Array mit den Anzahlen der verschiedenen Bewertungen.
     * @return der Durchschnitt der abgegebenen Bewertungen.
     * @throws IllegalArgumentException
     *          falls das gegebene Array {@code null} ist.
     * @throws ArithmeticException
     *          falls eine der Anzahlen im Array negativ ist.
     * @throws NoSuchElementException
     *          falls die Anzahl der gegebenen Bewertungen 0 ist.
     * 
     * Beispiele:
     * mean({3,5,3}) = 1
     * mean({2,10,10,12,11,5}) = 2.7
     * 
     */
    public static double mean(final int[] ratingCounts) {
        if(ratingCounts == null) throw new IllegalArgumentException();
        double sum = 0, counter = 0;
        for(int i = 0; i < ratingCounts.length;i++){
            if(ratingCounts[i] < 0) throw new ArithmeticException(); 
            sum = sum + i *  ratingCounts[i];
            counter += ratingCounts[i];
        }

        if(sum / counter == 0) throw new NoSuchElementException();

        return sum / counter;

    }

}
