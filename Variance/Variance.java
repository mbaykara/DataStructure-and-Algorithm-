import java.util.NoSuchElementException;

/**
 * AUFGABE Variance (10 Punkte)
 *
 * Implementieren Sie die Methode variance gemäß des Javadoc-Kommentares.
 * 
 * Hinweis: Die Methode mean darf, muss aber nicht implementiert/verwendet werden.
 */
public class Variance {

    /**
     * Berechnet die Varianz der gegebenen Messwerte.
     * 
     * Die Varianz ist definiert als die durchschnittliche quadratische 
     * Abweichung vom Durchschnitt der Werte.
     * Bezeichnet also X den Durchschnitt der Werte x_i (1 <= i <= x.length),
     * so gilt:
     * Varianz(x) = (\sum_{i=1}^{x.length} (x_i - X)^2) / x.length
     * 
     * @param values
     *          Array mit den gegebenen Messwerten.
     * @return die Varianz der gegegebenen Messwerte.
     * @throws IllegalArgumentException
     *          falls das gegebene Array {@code null} ist.
     * @throws NoSuchElementException
     *          falls das gegebene Array leer ist.
     * 
     * Beispiele:
     * variance({2,3,4,3}) = 0.5
     * variance({7,5,1,6,5}) = 4.16
     * her sayininin ortalama ile farkini bul
     * farklarin karesini al
     * hepsini topla
     * sonucu verisayisi-1 e böl
     * karekökünü a
     * 
     */
    public static double variance(final double[] values) {
        
        double farklarToplami=0.0;

        for(int i =0;i < values.length;i++){
            farklarToplami += (values[i] - mean(values)) * (values[i] - mean(values));
            
        }
        return (double)farklarToplami / values.length;
        
        
    }
    
    /**
     * Berechnet den Durchschnitt der gegebenen Werte.
     * 
     * Hinweis: Diese Methode darf, muss aber nicht implementiert/verwendet werden.
     * 
     * @param values
     *        Array mit den gegebenen Werten, deren Durchschnitt berechnet wird.
     * @return der Durchschnitt der gegebenen Werte.
     * @throws IllegalArgumentException
     *          falls das gegebene Array {@code null} ist.
     * @throws NoSuchElementException
     *          falls das gegebene Array leer ist.
     *          
     * Beispiele:
     * mean({2,3,4}) = 3.0
     * mean({7,5,1,6,5}) = 4.8
     */
    static double mean(final double[] values) {
        double ort = 0.0;
        for(int i=0; i < values.length;i++){
        ort += values[i];
        }
        return ort/values.length;
    }

}
