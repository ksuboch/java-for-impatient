package ch_01.hex;

import java.io.UnsupportedEncodingException;

class NotAsciiDecoder {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String ln = System.console().readLine();
        for(char ch : ln.toCharArray()) {
            if(ch > 255) {
                int c = (int) ch;
                System.out.println(ch + " -> U+" + Integer.toHexString(c));
            }
        }
    }
}
