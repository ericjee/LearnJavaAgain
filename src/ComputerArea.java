import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by eric on 2/24/16.
 */
public class ComputerArea {
    public static void main(String[] args) {
//        double redius = new Scanner(System.in).nextDouble();
//        double area = redius * redius * 3.14159;
//        System.out.println(area + "");
        GregorianCalendar calendar = new GregorianCalendar();
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = calendar.getFirstDayOfWeek();
    }
}
