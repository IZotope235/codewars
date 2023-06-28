package codewars;

import java.io.*;
import java.util.Arrays;

public class CountBy {

    public static int[] countBy(int x, int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = x * (i + 1);
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
    }
}
