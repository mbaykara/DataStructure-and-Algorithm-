
/**
 * Eine Person mit einem Namen, einem Alter und einem Gewicht.
 * 
 * Hinweis:
 * Diese Klasse wird nur für den Testfall benötigt!
 * Die Aufgabe findet sich in der Klasse Filter.
 * Die Klasse Person darf nicht geändert werden!
 */
public class Person
{
    
    private final String name;
    
    private final int age; // in Jahren
    
    private final int weight; // in kg
    
    /**
     * Legt eine Person an. Die Paramaterwerte werden nicht auf 
     * Sinnhaftigkeit geprüft - dieses muss beim Aufruf bedacht werden!
     */
    public Person(final String theName, final int theAge, final int theWeight) {
        name = theName;
        age = theAge;
        weight = theWeight;
    }
    
    /**
     * Gibt eine Bedingung zurück, die für jede Person genau dann wahr 
     * zurückliefert, wenn ihr Alter niedriger als das hier gegebene Alter ist.
     */
    public static Condition<Person> isYoungerThan(final int ageLimit) {
        return p -> p.age < ageLimit;
    }
    
    /**
     * Gibt eine Eigenschaft zurück, die zu jeder Person das Gewicht zurückliefert.
     */
    public static Value<Person> getWeight() {
        return p -> p.weight;
    }
    
}
