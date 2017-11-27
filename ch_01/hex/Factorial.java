package ch_01.hex;

import java.math.BigInteger;

class Factorial {
    public static void main(String[] args) {
        if(args.length == 1) {
            try {
                int n = Integer.parseInt(args[0]);
                BigInteger res = new BigInteger("1");
                for(int i = 1; i <= n; i++) {
                    res = res.multiply(new BigInteger(Integer.toString(i)));
                }
                System.out.println("Result: " + res);

            } catch (NumberFormatException nfe) {

            }
        } else {
            System.out.println("Using: \"Factorial n\"");
        }
    }
}
