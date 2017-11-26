package ch_01.hex;

class MinMaxDouble {
    public static void main(String[] args) {
        double min, i, max;

        i = 0.0;
        min = Math.nextDown(i);
        System.out.println("Min double: " + min);

        max = Math.nextUp(i);
        System.out.println("Max double: " + max);
    }
}