
public class Chess {

    /**
     * Diese Methode erzeugt eine Zeichenkette, die ein Schachbrettmuster aus Rauten ('#')
     * aufbaut, d. h. immer abwechselnd eine Raute und ein Minuszeichen ('-') in eine Zeile
     * setzt. Die erzeugte Zeichenkette wird zurückgegeben.
     *
     * Jede Zeile endet immer mit dem Zeichen '\n' (für Newline). 
     *
     * Die erste Zeile der Rückgabe beginnt immer mit einer Raute.
     * 
     * Die gegebene Höhe bestimmt dabei die Anzahl der Zeilen und die gegebene Breite
     * die Anzahl der Zeichen pro Zeile.
     *
     * Die zurückgegebene Zeichenkette enthält nur die Zeichen '#', '-' und '\n'.
     * 
     * @param height die Höhe des Schachbrettmusters (d. h. die Anzahl der Zeilen)
     * @param width die Breite des Schachbrettmustes (d. h. die Anzahl der Zeichen pro Zeile)
     * @return ein String, der ein Schachbrettmuster aus Rauten und Leerzeichen enthält
     * 
     * @throws IllegalArgumentException falls mind. einer der Parameterwerte kleiner als 3 oder
     * größer als 10 ist.
     * 
     * Beispiel:
     * generateRect(4,5) liefert "#-#-#\n-#-#-\n#-#-#\n-#-#-\n"
     * 
     * Auf der Konsole ausgegeben sieht das so aus:
     *
     * #-#-#
     * -#-#-
     * #-#-#
     * -#-#- 
     * 
     */
    public static String generateRect(final int height, final int width) {
        if(height < 3 || height > 10 || width < 3 || width > 10) throw new IllegalArgumentException();
        String result = "";

        int counter = height * width;
       
        for(int i =0; i < height * width; i++){

            if(counter !=0){
                result += "#";
                counter--;
            }

            if(counter % width == 0){
                result += "\n";

            }

            if(counter == 0) break;

            if(counter !=0){
                result += "-";
                counter--;
            }   

            if(counter % width == 0 && counter != 0 ){
                result += "\n";

            }                   
        }

        return result;

    }
}
