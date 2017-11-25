package ch_01.ex_01;

/**
 * UnsignedInteger
 */
public class UnsignedInteger {
    public static void main(String[] args) {
        byte a = 127;
        byte b = -1;

        System.out.println(Byte.toUnsignedInt(a));
        System.out.println(Byte.toUnsignedInt(b));
        System.out.println(Byte.toUnsignedInt(a) + Byte.toUnsignedInt(b));
    }
}