package generics;

/**
 * Created by eric on 4/7/16.
 */
public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] characters = {'H', 'E', 'L','L', 'O'};
        System.out.println("Array integerArray contains: ");
        printArray(integers);

        System.out.println("\nArray doubleArray contains: ");
        printArray(doubles);

        System.out.println("\nArray characterArray contains: ");
        printArray(characters);
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element: inputArray
             ) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }
}
