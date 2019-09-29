
/**
 * Gibt einen spezifischen Wert für das gegebene Element zurück, 
 * z. B. das Gewicht einer gegebenen Person.
 * 
 * Das Interface Value darf nicht geändert werden!
 */
public interface Value<T>
{

    /**
     * Gibt den zu betrachtenden Wert des gegebenen Elements zurück.
     * 
     * @param element das Element, dessen Wert zurückgegeben wird.
     * @return den zu betrachtenden Wert des gegebenen Elements.
     */
    public double get(final T element);

}
