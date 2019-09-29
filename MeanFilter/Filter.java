import java.util.NoSuchElementException;

/**
 * AUFGABE Filter (10 Punkte)
 *
 * Implementieren Sie die Methode mean gemäß des Javadoc-Kommentares.
 */
public class Filter {

    /**
     * Berechnet den Durchschnitt einer gegebenen Eigenschaft all der 
     * Elemente, die die gegebene Bedingung erfüllen.
     * 
     * Eine Bedingung hat eine Methode, welche zu einem gegebenen 
     * Objekt einen {@code boolean} zurückliefert, siehe {@link Condition}.
     * 
     * Eine Eigenschaft hat eine Methode, welche zu einem gegebenen 
     * Objekt einen {@code double} zurückliefert, siehe {@link Value}.
     * 
     * @param elements
     *          Array mit den Elementen, zu denen ein Durchschnitt 
     *          berechnet wird.
     * @param condition
     *          Bedingungsprüfung, die die Elemente erfüllen müssen, 
     *          welche bei der Durchschnittsbildung berücksichtigt werden.
     * @param value
     *          Eigenschaft, welche den gegebenen Elementen die Werte 
     *          zuordnet, aus denen der Durchschnitt gebildet wird.
     * @return der Durchschnitt der Werte der Elemente, welche die 
     *          gegebene Bedingung erfüllen.
     * @throws IllegalArgumentException
     *          falls das gegebene Array, die Bedingung oder die Eigenschaft 
     *          {@code null} ist oder das Array {@code null} enthält.
     * @throws NoSuchElementException
     *          falls kein Element die Bedingung erfüllt.
     * 
     * Beispiele:
     * Seien folgende Personen gegeben (jeweils Name, Alter, Gewicht)
     * herbert = new Person("Herbert", 27, 52)
     * frida = new Person("Frida", 43, 44)
     * margon = new Person("Margon", 71, 83)
     * 
     * isYoungerThan50 bezeichnet eine Condition<Person>, die für alle 
     *          Personen unter 50 wahr ist;
     * getWeight bezeichnet einen Value<Person>, der das Gewicht der 
     *          Person zurückgibt.
     * 
     * Dann ist:
     * mean({herbert, frida, margon}, isYoungerThan50, getWeight) = 48.0
     */
    public static <T> double mean(final T[] elements, final Condition<T> condition, final Value<T> value) {
        if(elements == null) throw new IllegalArgumentException();
        int counter=0;
        
      
        
        
        throw new UnsupportedOperationException();
    }

}
