package aliasing;

/**
 * Created by eric on 5/11/16.
 */
public class AllOps {
    void f(boolean b) {}
    void boolTest(boolean x, boolean y) {
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x &= y;
        x ^= y;
        x |= y;
    }

    void charTest(char x, char y) {
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = (char)~y;
        x = (char)(x & y);
        x = (char)(x | y);
        x = (char)(x ^ y);
        x = (char)(x << 1);
        x = (char)(x >> 1);
        x = (char)(x >>> 1);
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }

    public static void strTest(String str1, String str2) {
        boolean b = str1.equals(str2);
        System.out.println(b);
        b = str1 == str2;
        System.out.println(b);
        b = str1 != str2;
        System.out.println(b);

    }

    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big= " + big);
        int bigger = big * 4;
        System.out.println("bigger= " + bigger);
        strTest("sfds", "sfds");
        strTest("1212", "sdfs");
        strTest("1123131", "222222");
    }
}
