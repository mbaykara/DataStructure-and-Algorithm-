/**
 * AUFGABE
 * BeautifulNumbers (10 Punkte)
 * Implementieren Sie die Methode isPerfectNumber gemäß ihres Javadoc-Kommentares.
 * 
 *
 * Definition: Eine ganze Zahl a ist ein Teiler der ganzen Zahl b
 * (geschrieben "a | b" und gelesen als "a teilt b") wenn gilt: es gibt eine
 * ganze Zahl n, so dass a*n=b.
 * 
 * Ein echter Teiler einer Zahl ist ein Teiler, der positiv und nicht die Zahl
 * selbst ist.
 * 
 * Beispiele: 
 * Die Zahl 4 ist keine perfekte Zahl, denn ihre echten Teiler
 * sind 1 und 2 und 1+2=3. 3 ist aber ungleich 4.
 * 
 * Die Zahl 6 ist eine perfekte Zahl, denn ihre
 * echten Teiler 1,2 und 3 ergeben in der Summe 6.
 */
public final class BeautifulNumbers {

    /**
     * Ermittelt, ob die übergebene natürliche Zahl eine perfekte Zahl ist. Eine
     * Zahl ist dann perfekt, wenn sie die Summe ihrer echten Teiler ist. 
     *
     * @param number eine natürliche Zahl, für die festgestellt werden soll, ob
     * sie perfekt ist oder nicht
     * @return {@code true} falls die gegebene Zahl einer perfekte Zahl (d. h.
     * Summe ihrer echten Teiler) ist oder {
     * @false} falls die Zahl nicht perfekt ist
     * @throws IllegalArgumentException falls die übergebene Zahl negativ ist
     */
    public static boolean isPerfectNumber(final int number) throws IllegalArgumentException {
        if(number < 0) throw new IllegalArgumentException();

       int counter = 0;
       for(int i = 1; i < number; i++){
           if (number % i == 0){
               counter += i;
            }
        }
        
        return counter == number ;
    }

}
