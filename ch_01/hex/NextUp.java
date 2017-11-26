package ch_01.hex;

import java.math.BigDecimal;

class NextUp {
    public static void main(String[] args) {
        System.out.println(convert(3.14));
        System.out.println(convert(Math.nextUp(3.14)));
        System.out.println(convert(3.1400000000001));
        System.out.println(convert(Math.nextUp(3.1400000000001)));
        System.out.println(convert(3.1400000000006));
        System.out.println(convert(Math.nextUp(3.1400000000006)));
    }

    static private String convert(double d) {
        return "0b" + Long.toBinaryString(Double.doubleToRawLongBits(d));
    }
}