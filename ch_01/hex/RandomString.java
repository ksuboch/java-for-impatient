package ch_01.hex;

import java.util.Random;

class RandomString {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.printf(Long.toUnsignedString(generator.nextLong(), 26));
    }
}
