import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by eric on 4/6/16.
 */
public class StackDemo {
    static void showPush(Stack stack, int a) {
        stack.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }

    static void showPop(Stack stack) {
        System.out.println("pop -> ");
        Integer a = (Integer)stack.pop();
        System.out.println(a);
        System.out.println("stack: " + stack);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Stack: " + stack);
        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 99);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        try {
            showPop(stack);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
            e.printStackTrace();
        }
    }
}
