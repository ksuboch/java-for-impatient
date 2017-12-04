package ch_01.hex;

import java.util.ArrayList;

class PascalTriangle{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        int lineCount = Integer.parseInt(System.console().readLine());
        for(int i = 0; i < lineCount; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            inner.add(1);
            for(int j = 1; j < i; j++) {
                ArrayList<Integer> line = triangle.get(i - 1);
                int n = line.get(j - 1) + line.get(j);
                inner.add(n);
            }
            if (i > 0) inner.add(1);
            triangle.add(inner);
        }
        for (ArrayList<Integer> line : triangle) {
            System.out.println(line);
        }
    }
}
