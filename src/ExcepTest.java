/**
 * Created by eric on 4/5/16.
 */
public class ExcepTest {
    public static void main(String[] args) {
        int array[] = new int[2];
        try {
            System.out.println("Access element three: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception thrown: " + e);
        } finally {
            array[0] = 6;
            System.out.println("First element value: " + array[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("Out of the block");
    }
}
