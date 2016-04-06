package employee;

/**
 * Created by eric on 4/6/16.
 */
public class RunEncap {
    public static void main(String[] args) {
        EncapTest encapTest = new EncapTest();
        encapTest.setAge(20);
        encapTest.setName("Test");
        encapTest.setIdNum("123131");

        System.out.println("Name: " + encapTest.getName() + " Age: " + encapTest.getAge());
    }
}
