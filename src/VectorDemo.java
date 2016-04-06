import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by eric on 4/6/16.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(3, 2);
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + vector.capacity());

        vector.addElement(new Double(5.45));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Double(6.08));
        vector.addElement(new Integer(7));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Float(9.4));
        vector.addElement(new Integer(10));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Integer(11));
        vector.addElement(new Integer(12));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        if (vector.contains(new Integer(3)))
            System.out.println("Vector contains 3. " );
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement() + " ");
        }
        System.out.println();
    }
}
