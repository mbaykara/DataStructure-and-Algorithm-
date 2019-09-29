/*
 * Die Aufgabe findet sich in der Klasse Selection.
 * Die Klasse Person darf nicht geändert werden!
 */
public final class Person
{

    /**
     * Name der Person.
     */
    private final String name;

    /**
     * Das Alter der Person (in Jahren).
     */
    private final int age;

    /**
     * Erstellt eine Person mit dem gegebenen Namen und dem gegebenen Alter.
     * 
     * Der Aufrufer muss sicherstellen, dass nur sinnvolle Werte übergeben werden!
     * 
     * @param theName Name der Person.
     * @param theAge Alter der Person (in Jahren).
     */
    public Person(final String theName, final int theAge) {
        assert theName != null;
        assert theAge >= 0;
        name = theName;
        age = theAge;
    }

    /**
     * Liefert den Namen der Person zurück. 
     * 
     * Hinweis: Die Rückgabe ist nicht {@code null}!
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert das Alter der Person zurück.
     * 
     * Hinweis: Die Rückgabe ist nicht negativ!
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() + " (" + getAge() + " Jahre" + super.toString() + ")";
    }

}
