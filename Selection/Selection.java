import java.util.*;

/**
 * AUFGABE Selection (10 Punkte)
 * 
 * Implementieren Sie die Methode {@link #selectOlder} gemäß des Javadoc-Kommentares.
 */
public class Selection {

    /**
     * Diese Methode sucht aus einer gegebenen Menge von Personen all jene 
     * heraus, deren Alter mindestens dem gegebenen Alter entspricht, und gibt 
     * dann eine Menge mit genau diesen Personen zurück.
     * 
     * @param persons
     *            Menge der zu untersuchenden Personen
     * @param minimumAge
     *            Mindestalter der gesuchten Personen
     * @return Menge aller Personen aus der gegebenen Menge, deren Alter 
     *            größer oder gleich dem gegebenen Mindestalter sind.
     * 
     * @throws IllegalArgumentException
     *            falls die gegebene Menge {@code null} ist oder {@code null} 
     *            enthält oder das gegebene Mindestalter negativ ist.
     * 
     * Beispiel:
     * Sei die Menge persons dreielementig; die enthaltenen Personen sind
     * Miriam (12 Jahre), Gene (95 Jahre), Agathe (28 Jahre)
     * 
     * Der Aufruf von selectOlder(persons, 25) liefert dann eine 
     * zweielementige Menge zurück mit
     * Gene, Agathe
     */
    public static Set<Person> selectOlder(final Set<Person> persons, final int minimumAge) {
            Set<Person> filtered = new HashSet<Person>();
        for(Person p: persons){
            if(p.getAge() >= minimumAge){
                filtered.add(p);
                          }
        }
        
        
        return filtered;
        
    }

}
