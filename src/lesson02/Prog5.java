package lesson02;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        System.out.println("Output arrays: " + Arrays.toString(combine(a, b)));
    }

    public static int[] combine(int[] a, int[] b) {
        int[] combinedArr = new int[a.length + b.length];
        System.arraycopy(a, 0, combinedArr, 0, a.length);
        System.arraycopy(b, 0, combinedArr, a.length, b.length);
        return combinedArr;
    }
}
