package ch_01.hex;

import java.util.Arrays;
import java.util.Random;

class RandomLottery {
    public static void main(String[] args) {
        Random generator = new Random();

        int arr[] = new int[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int lot[] = new int[6];
        for(int i = 0; i < 6; i++) {
            int j = generator.nextInt(arr.length);
            lot[i] = j;
        }

        Arrays.sort(lot);
        System.out.println(Arrays.toString(lot));
    }
}
