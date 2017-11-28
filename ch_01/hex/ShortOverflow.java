package ch_01.hex;

class ShortOverflow {
    public static void main(String[] args) {
        short a, b;
        System.out.println("Input short value from 0 to 65535");
        a = readShort();
        System.out.println("Input yet another short value from 0 to 65535");
        b = readShort();
        System.out.println("a = " + (a - Short.MIN_VALUE) + " b = " + (b - Short.MIN_VALUE));
        System.out.println("Sum  = " + ((a + b) - 2 * Short.MIN_VALUE));
        System.out.println("Dif  = " + (a - b));
        System.out.println("Mul  = " + (a * b - a * Short.MIN_VALUE - b * Short.MIN_VALUE + Short.MIN_VALUE * Short.MIN_VALUE));
        System.out.println("Div = " + (a - Short.MIN_VALUE) / (b - Short.MIN_VALUE));
        System.out.println("Mod = " + (a - Short.MIN_VALUE) % (b - Short.MIN_VALUE));
    }

    static private short readShort() {
        while(true) {
            String ln = System.console().readLine();
            try{
                short res = (short) (Integer.parseInt(ln) + Short.MIN_VALUE);
                return res;
            } catch (NumberFormatException nfe) {
                System.out.println("Not a short number");
            }
        }
    }
}
