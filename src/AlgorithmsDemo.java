import java.util.*;

/**
 * Created by eric on 4/6/16.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        Comparator comparator = Collections.reverseOrder();
        Collections.sort(linkedList, comparator);
        Iterator iterator = linkedList.iterator();
        System.out.println("List sorted in reverse: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        Collections.shuffle(linkedList);
        iterator = linkedList.iterator();
        System.out.println("List shuffled: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + Collections.min(linkedList));
        System.out.println("Maximum: " + Collections.max(linkedList));
    }
}
