import java.util.Date;

/**
 * Created by eric on 3/30/16.
 */
public class TestArray {
    public static void main(String[] args) {
        double[] myList = {2.3, 3.5, 8.9, 1.2, 3.4};
        double total = 0;
        double max = myList[0];
        Date date = new Date();
        for (double element:myList
             ) {
            total += element;
            if (element > max) max = element;
            System.out.println(element);
        }
        System.out.println(total);
        System.out.println(max);
        System.out.println(date.toString());
    }
}
