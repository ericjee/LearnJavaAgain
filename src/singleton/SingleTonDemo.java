package singleton;

/**
 * Created by eric on 4/10/16.
 */
public class SingleTonDemo {
    public static void main(String[] args) {
        SingleTon test1 = SingleTon.getInstance();
        SingleTon test2 = SingleTon.getInstance();
    }
}
