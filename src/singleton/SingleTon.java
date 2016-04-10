package singleton;

/**
 * Created by eric on 4/10/16.
 */
public class SingleTon {
    private static SingleTon singleTon = null;

    public SingleTon() {
        System.out.println("SingleTon");
    }

    public static SingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
