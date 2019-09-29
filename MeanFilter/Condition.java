
/**
 * Prüft, ob gegebene Element eine bestimmte Bedingung einhalten, z. B. 
 * ob gegebene Personen mindestens ein bestimmtes Alter aufweisen.
 * 
 * Das Interface Condition darf nicht geändert werden!
 */
public interface Condition<T>
{
    
    /**
     * Gibt genau dann wahr zurück, wenn das gegebene Element die zu 
     * prüfende Bedingung erfüllt.
     * 
     * @param element das Element, für welches geprüft wird, ob es die Bedingung erfüllt.
     * @return {@code true}, genau dann, wenn das gegebene Element die Bedingung erfüllt.
     */
    public boolean check(final T element);
    
}
