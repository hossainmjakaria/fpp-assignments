package lesson02;

public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, -18, 6, 3, 1, 0, -22};
        System.out.println("Minimum Number: " + min(arrayOfInts));
    }

    static int min(int[] arrayOfInts) {
        int minNumber = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (minNumber > arrayOfInts[i]) {
                minNumber = arrayOfInts[i];
            }
        }

        return minNumber;
    }
}
