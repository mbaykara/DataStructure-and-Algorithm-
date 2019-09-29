import java.util.*;

/**
 * AUFGABE
 * CommonCharacters (10 Punkte)
 * Implementieren Sie die Methode getCommonCharacters gemäß ihres Javadoc-Kommentares.
 * 
 * Beispiel:
 * Zeichenkette a: "baac"
 * Zeichenkette b: "fdeabac"
 * 
 * Die Buchstaben 'a', 'b' und 'c' kommen in beiden Zeichenketten vor. Die Rückgabe
 * lautet in diesem Fall also "abc" oder "acb" oder "bac" oder "bca" oder "cab" oder "cba".
 *  
 */
public final class CommonCharacters {

    /**
     * Ermittelt die Buchstaben, die in den beiden gegebenen Zeichenketten
     * vorkommen und gibt diese Buchstaben als neue Zeichenkette zurück. Falls
     * es keine gemeinsamen Buchstaben gibt (das schließt auch die Fälle
     * ungültiger Parameterwerte ein), so wird eine leere Zeichenkette
     * zurückgegeben.
     *
     * In der zurückgegebenen Zeichenkette kommen keine Buchstaben mehrfach vor.
     *
     * @param a die erste Zeichenkette
     * @param b die zweite Zeichenkette
     * @return die gemeinsamen Buchstaben der beiden Zeichenketten
     */
    public static String getCommonCharacters(final String a, final String b) {

        char a1[] =a.toCharArray();
        char b2[] =b.toCharArray();

        Set<Character> set =new HashSet<>();
        for(int i=0;i<a1.length;i++){

            for(int j=0;j<b2.length;j++){

                if(a1[i] == b2[j]){
                    set.add(a1[i]);
                }   

            }

        }
        StringBuilder resultBuilder = new StringBuilder();
        Iterator<Character> it = set.iterator();
        while(it.hasNext()) {
            resultBuilder.append(it.next().charValue());
        }

        return resultBuilder.toString();
        
    } 
}

