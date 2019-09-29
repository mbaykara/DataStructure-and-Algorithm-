import java.util.*;

public class Points {
    
    /**
     * Diese Methode nimmt eine Sequenz von Zahlen (in Form eines
     * Iterators), die eine Menge von homogenen Koordinaten enthält und wie
     * folgt strukturiert ist:
     * 
     *     [x1, y1, w1, x2, y2, w2, ..., xn, yn, wn]
     * 
     * wobei x_i, y_i einen Punkt in 2D und w_i das zu x_i und y_i
     * zugehörige Gewicht darstellt. Aus dieser Sequenz wird eine List von
     * inhomogenen Punkten in 2D berechnet, wobei folgende Berechnungsformel
     * zugrunde gelegt wird:
     * 
     *     {@code new Point2D(x_i/w_i, y_i/w_i);}
     *     (integer division)
     * 
     * Beispiel:
     * 
     *     iter = [4, 6, 2, 9, 6, 3, 20, 10, 10]
     *     Ergebnis: [Point2D(2, 3), Point2D(3, 2), Point2D(2, 1)]
     * 
     * 
     * 
     * Anmerkungen:
     * 
     * (1) Enthält {@code iter} ein Gewicht mit dem Wert {@code 0}, wird
     * eine {@link ArithmeticException} geworfen.
     * 
     * (2) Es kann NICHT davon ausgegangen werden, dass {@code iter != null}
     * bzw. {@code iter.next() != null} gilt. Entsprechend wird eine
     * {@link IllegalArgumentException} geworfen.
     * 
     * (3) Ferner muss überprüft werden, dass die Anzahl der in {@code iter}
     * enthaltenden Zahlen restlos durch 3 teilbar ist. Der Divisionsrest
     * kann mithilfe des % Operators ermittelt werden:
     * 
     *     6 % 4 = 2
     *     8 % 4 = 0
     * 
     * Ist die Anzahl der in {@code iter} enthaltenden Zahlen nicht restlos
     * durch 3 teilbar, wird eine {@link IllegalArgumentException} geworfen.
     * 
     * @param iter
     *      Eine Sequenz von Zahlen.
     * @return
     *      Das Ergebnis, wie oben beschrieben.
     * @throws IllegalArgumentException
     *      Falls {@code iter == null} ist, {@code iter} {@code null} Werte
     *      enthält oder die Anzahl der in {@code iter} enthaltenden Zahlen
     *      nicht restlos durch 3 teilbar ist.
     * @throws ArithmeticException
     *      Falls eines der in {@code iter} enthaltenden Gewichte {@code 0}
     *      ist.
     */
    public List<Point2D> points(final Iterator<Integer> iter) {
        	List<Integer> list = new ArrayList<>();
		List<Point2D> points = new ArrayList<>();
		Point2D p;

		if (iter == null)
			throw new IllegalArgumentException();

		if (list.size() % 3 != 0)
			throw new ArithmeticException();
		
		iter.forEachRemaining(list::add);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i + 2) == 0)
				throw new ArithmeticException();

			p = new Point2D(list.get(i) / list.get(i + 2), list.get(i + 1) / list.get(i + 2));
			points.add(p);
			i = i + 2;
		}
		return points;

        
    }



/****************************************************************************
*                                                                           *
* Die folgenden Zeilen dürfen NICHT verändert werden!                       *
*                                                                           *
****************************************************************************/

    /**
     * Ein Punkt in 2D.
     */
    public class Point2D {
        /**
         * Die X-Koordinate.
         */
        private int x;
        
        /**
         * Die Y-Koordinate.
         */
        private int y;
        
        /**
         * Erzeugt ein neues Point2D-Objekt mit gegebener X- und
         * Y-Koordinate.
         * 
         * @param pX
         *      Die X-Koordinate des zu erzeugenden Objektes.
         * @param pY
         *      Die Y-Koordinate des zu erzeugenden Objektes.
         */
        public Point2D(final int pX, final int pY) {
            x = pX;
            y = pY;
        }
        
        /**
         * Gibt die X-Koordinate eines Punktes zurück.
         */
        public int getX() {
            return x;
        }
        
        /**
         * Gibt die Y-Koordinate eines Punktes zurück.
         */
        public int getY() {
            return y;
        }
    }
}
