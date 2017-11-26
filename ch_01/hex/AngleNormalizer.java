package ch_01.hex;

class AngleNormalizer {

    final static int MAX_DEGREES = 360;

    public static void main(String[] args) {
        while(true) {
            System.out.println("Type integer value in degrees or \"q\" to exit.");
            String ln = System.console().readLine();
            if(ln.equalsIgnoreCase("Q")) {
                System.out.println("Exit.");
                break;
            } else {
                try {
                    int res = Integer.parseInt(ln);
                    System.out.println("Input integer: ");
                    res %= MAX_DEGREES;

                    if(res < 0) {
                        res = MAX_DEGREES + res;
                    }
                    System.out.println("Using %: ");
                    System.out.println(res);

                    System.out.println("Using floorMod: ");
                    System.out.println(Math.floorMod(res, MAX_DEGREES));
                } catch (NumberFormatException nfe) {
                    System.out.println("Not a number");
                }
            }
        }
    }
}