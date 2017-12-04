package ch_01.hex;

import java.util.ArrayList;

class MagicSquare {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> cube = readArray();
        System.out.println(cube);
        Boolean chRows = checkRows(cube);
        System.out.println("Rows equality: " + chRows);
        Boolean chCols = checkColumns(cube);
        System.out.println("Cols equality: " + chCols);
        Boolean chDiag = checkDiags(cube);
        System.out.println("Diag equality: " + chDiag);
    }

    private static ArrayList<ArrayList<Integer>> readArray() {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        while(true) {

            String ln = System.console().readLine();
            if (ln.isEmpty()) break;
            String[] splitted_line = ln.split(" ");
            int n = splitted_line.length;

            ArrayList<Integer> inner = new ArrayList<>();
            for(String val : splitted_line) {
                inner.add(Integer.parseInt(val));
            }
            outer.add(inner);
        }
        return outer;
    }

    private static Boolean checkRows(ArrayList<ArrayList<Integer>> square) {
        Boolean result = true;
        int sum_1 = 0;
        for (int el : square.get(0)) {
            sum_1 += el;
        }
        for (ArrayList<Integer> line : square) {
            int sum = 0;
            for (int el : line) {
                sum += el;
            }
            if (sum_1 != sum) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static Boolean checkColumns(ArrayList<ArrayList<Integer>> square) {
        Boolean result = true;
        int sum_1 = 0;
        for(ArrayList<Integer> row : square) {
            sum_1 += row.get(0);
        }
        for(int i = 1; i < square.size(); i++) {
            int sum = 0;
            for (ArrayList<Integer> row : square) {
                sum += row.get(i);
            }
            if (sum_1 != sum) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static Boolean checkDiags(ArrayList<ArrayList<Integer>> square) {
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i < square.size(); i++) {
            sum_1 += square.get(i).get(i);
            sum_2 += square.get(i).get(square.size() - 1 - i);
        }
        return sum_1 == sum_2;
    }
}
