/**
 * AUFGABE 3 
 * indexOfFirstNoneDNABase (10 Punkte) 
 * Implementieren Sie die Methode indexOfFirstNoneDNABase
 * gemäß des Javadoc-Kommentares.
 * 
 */
public class DNA {

    /**
     * Untersucht, ob die übergebene Zeichenkette mindestens einen anderen
     * Buchstaben als 'A', 'C', 'T' und 'G' enthält (als Großbuchstaben) und
     * gibt in diesem Fall den Index des ersten von 'A', 'C', 'T' und 'G'
     * verschiedenen Buchstaben zurück. Falls die übergebene Zeichenkette
     * keinen von 'A', 'C', 'T' und 'G' verschiedenen Buchstaben enthält, wird
     * -1 zurückgegeben.
     *
     * 
     * Beispiele:
     * 
     * Die Methode liefert {@code -1} für die Zeichenkette "TCGAAATTGGC".
     * 
     * Die Methode liefert {@code 3} für die Zeichenkette "TCGaATC".
     * 
     * @param input
     *            die zu prüfende Zeichenkette
     * @return Den Index des ersten von 'A', 'C', 'T' und 'G' verschiedenen
     *         Buchstaben, falls die übergebene Zeichenkette einen solchen
     *         enthält, -1 sonst.
     * @throws IllegalArgumentException
     *             falls der Parameterwert {@code null} ist
     */
    public static int indexOfFirstNoneDNABase(final String input) {

        int result = -1;
        char[] arr = input.toCharArray();

        for(int i =0; i < arr.length;i++){
            if(Character.isLowerCase(arr[i])){
                return i;
            }
        }

        return result;
    }

}
