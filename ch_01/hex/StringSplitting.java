package ch_01.hex;

class StringSplitting {
    public static void main(String[] args) {
        String ln = System.console().readLine();
        for (int beginIndex = 0; beginIndex < ln.length(); beginIndex++) {
            for (int endIndex = beginIndex + 1; endIndex <= ln.length(); endIndex++) {
                String tmp = ln.substring(beginIndex, endIndex);
                if(tmp.trim().isEmpty()) {
                    continue;
                }
                System.out.println(ln.substring(beginIndex, endIndex));
            }
        }
    }
}
