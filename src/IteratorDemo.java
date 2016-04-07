import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by eric on 4/6/16.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.println("Original contents of arrayList: ");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("Modified contents of arrayList: ");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();

        System.out.println("Modified list backwards: ");
        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
