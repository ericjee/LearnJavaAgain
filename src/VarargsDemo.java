/**
 * Created by eric on 4/5/16.
 */
public class VarargsDemo {
    public static void main(String[] args) {
        printMax(34, 2, 3, 3, 56.5);
        printMax(new double[]{1, 3, 4});
    }

    private static void printMax(double... numbers) {
        if(numbers.length == 0) {
            return;
        }
        double result = numbers[0];

        for (int i =1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
