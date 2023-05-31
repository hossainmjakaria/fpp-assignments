package lesson02;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        String[] arr = {"horse", "dog", "cat", "horse", "dog" };
        String[] newArr = removeDups(arr);
        System.out.println("After removing duplicates:" + Arrays.toString(newArr));
    }

    static String[] removeDups(String[] arr) {
        String[] temp = new String[arr.length];
        int newSize = 1;
        temp[0]= arr[0];

        for (int i = 1; i < arr.length; i++) {
            boolean foundDuplicate = false;

            for (int j = 0; j < temp.length; j++) {
                if (arr[i] == temp[j]) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (!foundDuplicate) {
                temp[newSize++] = arr[i];
            }
        }

        String[] finalRecords = new String[newSize];

        for (int i = 0; i < newSize; i++) {
            finalRecords[i] = temp[i];
        }

        return finalRecords;
    }
}
