package ch_01.hex;

class IntOverflow {
    public static void main(String[] args) {
        int min = (int)Double.MIN_VALUE;
        int max = (int)Double.MAX_VALUE;

        System.out.println("\nDouble min values");
        System.out.println("Double: " + Double.MIN_VALUE);
        System.out.println("Int: " + min);
        System.out.println("Int min: " + Integer.MIN_VALUE);

        System.out.println("\nDouble max values: ");
        System.out.println("Double: " + Double.MAX_VALUE);
        System.out.println("Int: " + max);
        System.out.println("Int max: " + Integer.MAX_VALUE);
    }
}