package ch_01.hex;

class StringEquals {
    public static void main(String[] args) {
        String st1 = System.console().readLine();
        String st2 = System.console().readLine();
        Boolean result = true;

        if(st1.length() == st2.length()) {
            for(int i = 0; i < st1.length(); i++) {
                if(st1.charAt(i) != st2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        if(result) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
