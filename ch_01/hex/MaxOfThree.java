package ch_01.hex;

/**
 * MaxOfThree
 */
public class MaxOfThree {
    public static void main(String[] args) {
        System.out.println("Input 3 numbers.");
        int a = readInt();
        int b = readInt();
        int c = readInt();
        System.out.println("a = " + a + " b = " + b + " c = " + c + "\n");
        if (a >= b && a >= c) {
            System.out.println("IfMax: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("IfMax: " + b);
        } else {
            System.out.println("IfMax: " + c);
        }
        System.out.println();
        System.out.println("MathMax: " + Math.max(a, Math.max(b, c)));
    }

    static private int readInt() {
        while(true) {
            String ln = System.console().readLine();
            try{
                int res = Integer.parseInt(ln);
                return res;
            } catch (NumberFormatException nfe) {
                System.out.println("Not a number");
            }
        }
    }
}