package ch_01.hex;

import java.util.Scanner;

/**
 * IntReader
 */
public class IntReader {

    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите число или \"q\" для выхода:");
            String ln = System.console().readLine();
            if(ln.equalsIgnoreCase("Q")) {
                System.out.println("Выход.");
                break;
            } else {
                try {
                    int res = Integer.parseInt(ln);
                    System.out.println("Число: " + res);
                    System.out.println("Двоичная форма: " + Integer.toBinaryString(res));
                    System.out.println("Восьмеричная форма: " + Integer.toOctalString(res));
                    System.out.println("Шестнадцатеричная форма: " + Integer.toHexString(res));
                    System.out.println("Шестнадцатеричная форма: " + Double.toHexString(1 / (double)res));
                    System.out.println();
                } catch (NumberFormatException nfe) {
                    System.out.println("Не число.");
                }
            }
        }
    }
}