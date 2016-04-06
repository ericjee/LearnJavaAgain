import java.util.BitSet;

/**
 * Created by eric on 4/6/16.
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        for (int i=0; i<16; i++) {
            if((i%2) == 0) bitSet1.set(i);
            if ((i%5) != 0) bitSet2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bitSet1);
        System.out.println("\n Initial in bits2: ");
        System.out.println(bitSet2);

        bitSet2.and(bitSet1);
        System.out.println("\n bits2 AND bits1: ");
        System.out.println(bitSet2);

        bitSet2.or(bitSet1);
        System.out.println("\n bits2 or bits1: ");
        System.out.println(bitSet2);

        bitSet2.xor(bitSet1);
        System.out.println("\n bits2 XOR bits1: ");
        System.out.println(bitSet2);
    }
}
